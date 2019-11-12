package com.lqx.service.user;

import com.game.dao.user.model.User;
import com.lqx.dao.user.req.UserReq;

import java.util.List;
import java.math.BigDecimal;
import java.sql.Time;

/**
 * user业务接口定义
 * @author 李其璇
 * @date 2019/11/12 15:28
 */
public interface UserService {

    /**
     * 根据ID查询
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    User findById(Integer id);

    /**
     * 根据ID集查询
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    List<User> findByIds(List<Integer> ids);

    /**
     * 创建
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    Integer create(UserReq req);

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
    void updateById(UserReq req);

}