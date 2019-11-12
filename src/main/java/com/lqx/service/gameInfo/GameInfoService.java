package com.lqx.service.gameInfo;

import com.game.dao.gameInfo.model.GameInfo;
import com.lqx.dao.gameInfo.req.GameInfoReq;

import java.util.List;
import java.math.BigDecimal;

/**
 * gameInfo业务接口定义
 * @author 李其璇
 * @date 2019/11/12 15:28
 */
public interface GameInfoService {

    /**
     * 根据ID查询
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    GameInfo findById(Integer id);

    /**
     * 根据ID集查询
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    List<GameInfo> findByIds(List<Integer> ids);

    /**
     * 创建
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    Integer create(GameInfoReq req);

    /**
     * 根据ID删除
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    void deleteById(Integer id);

    /**
     * 根据ID集删除
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    void deleteByIds(List<Integer> ids);

    /**
     * 根据ID更新
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    void updateById(GameInfoReq req);

}