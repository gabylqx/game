package com.lqx.api.gameType;

import com.lqx.api.BaseController;
import com.lqx.core.model.R;
import com.game.dao.gameType.model.GameType;
import com.lqx.dao.gameType.req.GameTypeReq;
import com.lqx.service.gameType.GameTypeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import java.math.BigDecimal;

/**
 * 游戏分类表
 * @author 李其璇
 * @date 2019/11/12 15:28
 */
@RestController
@RequestMapping("/gameType")
public class GameTypeController extends BaseController {

    @Autowired
    private GameTypeService gameTypeService;

    /**
     * 根据ID查询
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    @GetMapping("/{id}")
    public R<GameType> findById(@PathVariable Integer id) {
        return R.data(gameTypeService.findById(id));
    }

    /**
     * 根据ID集查询
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    @GetMapping("/batch/{ids}")
    public R<List<GameType>> findByIds(@PathVariable String ids) {
        if(StringUtils.isNotBlank(ids)) {
            String[] idArray = ids.split(",");
            List<Integer> idList = new ArrayList<>();
            for (String id: idArray) {
                idList.add(Integer.valueOf(id.trim()));
            }
            return R.data(gameTypeService.findByIds(idList));
        }
        return R.success();
    }
    /**
     * 创建
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    @PostMapping("/create")
    public R create(GameTypeReq req) {
        return R.data(gameTypeService.create(req));
    }

    /**
     * 根据ID删除
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    @GetMapping("/delete/{id}")
    public R deleteById(@PathVariable Integer id) {
        gameTypeService.deleteById(id);
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
            gameTypeService.deleteByIds(idList);
        }
        return R.success();
    }
    /**
     * 根据ID更新
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    @PostMapping("/update")
    public R updateById(GameTypeReq req) {
        gameTypeService.updateById(req);
        return R.success();
    }

}