package com.lqx.service.gameType;

import com.game.dao.gameType.model.GameType;
import com.lqx.dao.gameType.req.GameTypeReq;

import java.util.List;
import java.math.BigDecimal;

/**
 * gameType业务接口定义
 * @author 李其璇
 * @date 2019/11/12 15:28
 */
public interface GameTypeService {

    /**
     * 根据ID查询
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    GameType findById(Integer id);

    /**
     * 根据ID集查询
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    List<GameType> findByIds(List<Integer> ids);

    /**
     * 创建
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    Integer create(GameTypeReq req);

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
    void updateById(GameTypeReq req);

}