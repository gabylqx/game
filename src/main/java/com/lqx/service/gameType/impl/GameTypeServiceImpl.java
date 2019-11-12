package com.lqx.service.gameType.impl;

import com.lqx.dao.gameType.GameTypeMapper;
import com.game.dao.gameType.model.GameType;
import com.lqx.dao.gameType.model.GameTypeExample;
import com.lqx.dao.gameType.req.GameTypeReq;
import com.lqx.service.gameType.GameTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

import java.math.BigDecimal;

/**
 * 游戏分类表业务实现
 * @author 李其璇
 * @date 2019/11/12 15:28
 */
@Service
public class GameTypeServiceImpl implements GameTypeService {

    @Autowired
    private GameTypeMapper gameTypeMapper;

    @Override
    public GameType findById(Integer id) {
        return gameTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GameType> findByIds(List<Integer> ids) {
        GameTypeExample gameTypeExample = new GameTypeExample();
        gameTypeExample.createCriteria().andIdIn(ids);
        return gameTypeMapper.selectByExample(gameTypeExample);
    }

    @Override
    public Integer create(GameTypeReq req) {
        GameType gameType = new GameType();
        BeanUtils.copyProperties(req, gameType);
        gameTypeMapper.insertSelective(gameType);
        return gameType.getId();
    }

    @Override
    public void deleteById(Integer id) {
        gameTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIds(List<Integer> ids) {
        if(CollectionUtils.isEmpty(ids))
            return;
        GameTypeExample gameTypeExample = new GameTypeExample();
        gameTypeExample.createCriteria().andIdIn(ids);
        gameTypeMapper.deleteByExample(gameTypeExample);
    }

    @Override
    public void updateById(GameTypeReq req) {
        GameType gameType = new GameType();
        BeanUtils.copyProperties(req, gameType);
        int result = gameTypeMapper.updateByPrimaryKeySelective(gameType);
        if(result == 0)
            throw new RuntimeException("更新失败，更新结果数为0");
    }
}