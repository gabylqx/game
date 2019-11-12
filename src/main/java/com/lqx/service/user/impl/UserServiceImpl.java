package com.lqx.service.user.impl;

import com.lqx.dao.user.UserMapper;
import com.game.dao.user.model.User;
import com.lqx.dao.user.model.UserExample;
import com.lqx.dao.user.req.UserReq;
import com.lqx.service.user.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

import java.math.BigDecimal;
import java.sql.Time;

/**
 * 用户表业务实现
 * @author 李其璇
 * @date 2019/11/12 15:28
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> findByIds(List<Integer> ids) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdIn(ids);
        return userMapper.selectByExample(userExample);
    }

    @Override
    public Integer create(UserReq req) {
        User user = new User();
        BeanUtils.copyProperties(req, user);
        userMapper.insertSelective(user);
        return user.getId();
    }

    @Override
    public void deleteById(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIds(List<Integer> ids) {
        if(CollectionUtils.isEmpty(ids))
            return;
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdIn(ids);
        userMapper.deleteByExample(userExample);
    }

    @Override
    public void updateById(UserReq req) {
        User user = new User();
        BeanUtils.copyProperties(req, user);
        int result = userMapper.updateByPrimaryKeySelective(user);
        if(result == 0)
            throw new RuntimeException("更新失败，更新结果数为0");
    }
}