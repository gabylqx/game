package com.lqx.api.user;

import com.lqx.api.BaseController;
import com.lqx.core.model.R;
import com.game.dao.user.model.User;
import com.lqx.dao.user.req.UserReq;
import com.lqx.service.user.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import java.math.BigDecimal;
import java.sql.Time;

/**
 * 用户表
 * @author 李其璇
 * @date 2019/11/12 15:28
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    /**
     * 根据ID查询
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    @GetMapping("/{id}")
    public R<User> findById(@PathVariable Integer id) {
        return R.data(userService.findById(id));
    }

    /**
     * 根据ID集查询
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    @GetMapping("/batch/{ids}")
    public R<List<User>> findByIds(@PathVariable String ids) {
        if(StringUtils.isNotBlank(ids)) {
            String[] idArray = ids.split(",");
            List<Integer> idList = new ArrayList<>();
            for (String id: idArray) {
                idList.add(Integer.valueOf(id.trim()));
            }
            return R.data(userService.findByIds(idList));
        }
        return R.success();
    }
    /**
     * 创建
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    @PostMapping("/create")
    public R create(UserReq req) {
        return R.data(userService.create(req));
    }

    /**
     * 根据ID删除
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    @GetMapping("/delete/{id}")
    public R deleteById(@PathVariable Integer id) {
        userService.deleteById(id);
        return R.success();
    }

    /**
     * 根据ID集删除
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    @GetMapping("/delete/batch/{ids}")
    public R deleteByIds(@PathVariable String ids) {
        if(StringUtils.isNotBlank(ids)) {
            String[] idArray = ids.split(",");
            List<Integer> idList = new ArrayList<>();
            for (String id: idArray) {
              idList.add(Integer.valueOf(id.trim()));
            }
            userService.deleteByIds(idList);
        }
        return R.success();
    }
    /**
     * 根据ID更新
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    @PostMapping("/update")
    public R updateById(UserReq req) {
        userService.updateById(req);
        return R.success();
    }

}