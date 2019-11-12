package com.lqx.service.gameInfo.impl;

import com.lqx.dao.gameInfo.GameInfoMapper;
import com.game.dao.gameInfo.model.GameInfo;
import com.lqx.dao.gameInfo.model.GameInfoExample;
import com.lqx.dao.gameInfo.req.GameInfoReq;
import com.lqx.service.gameInfo.GameInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

import java.math.BigDecimal;

/**
 * 游戏主表业务实现
 * @author 李其璇
 * @date 2019/11/12 15:28
 */
@Service
public class GameInfoServiceImpl implements GameInfoService {

    @Autowired
    private GameInfoMapper gameInfoMapper;

    @Override
    public GameInfo findById(Integer id) {
        return gameInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GameInfo> findByIds(List<Integer> ids) {
        GameInfoExample gameInfoExample = new GameInfoExample();
        gameInfoExample.createCriteria().andIdIn(ids);
        return gameInfoMapper.selectByExample(gameInfoExample);
    }

    @Override
    public Integer create(GameInfoReq req) {
        GameInfo gameInfo = new GameInfo();
        BeanUtils.copyProperties(req, gameInfo);
        gameInfoMapper.insertSelective(gameInfo);
        return gameInfo.getId();
    }

    @Override
    public void deleteById(Integer id) {
        gameInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIds(List<Integer> ids) {
        if(CollectionUtils.isEmpty(ids))
            return;
        GameInfoExample gameInfoExample = new GameInfoExample();
        gameInfoExample.createCriteria().andIdIn(ids);
        gameInfoMapper.deleteByExample(gameInfoExample);
    }

    @Override
    public void updateById(GameInfoReq req) {
        GameInfo gameInfo = new GameInfo();
        BeanUtils.copyProperties(req, gameInfo);
        int result = gameInfoMapper.updateByPrimaryKeySelective(gameInfo);
        if(result == 0)
            throw new RuntimeException("更新失败，更新结果数为0");
    }
}