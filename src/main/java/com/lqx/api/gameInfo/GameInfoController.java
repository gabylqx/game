package com.lqx.api.gameInfo;

import com.lqx.api.BaseController;
import com.lqx.core.model.R;
import com.lqx.dao.gameInfo.model.GameInfo;
import com.lqx.dao.gameInfo.req.GameInfoReq;
import com.lqx.service.gameInfo.GameInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import java.math.BigDecimal;

/**
 * 游戏主表
 * @author 李其璇
 * @date 2019/11/12 15:28
 */
@RestController
@RequestMapping("/gameInfo")
public class GameInfoController extends BaseController {

    @Autowired
    private GameInfoService gameInfoService;

    /**
     * 根据ID查询
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    @GetMapping("/{id}")
    public R<GameInfo> findById(@PathVariable Integer id) {
        return R.data(gameInfoService.findById(id));
    }

    /**
     * 根据ID集查询
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    @GetMapping("/batch/{ids}")
    public R<List<GameInfo>> findByIds(@PathVariable String ids) {
        if(StringUtils.isNotBlank(ids)) {
            String[] idArray = ids.split(",");
            List<Integer> idList = new ArrayList<>();
            for (String id: idArray) {
                idList.add(Integer.valueOf(id.trim()));
            }
            return R.data(gameInfoService.findByIds(idList));
        }
        return R.success();
    }
    /**
     * 创建
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    @PostMapping("/create")
    public R create(GameInfoReq req) {
        return R.data(gameInfoService.create(req));
    }

    /**
     * 根据ID删除
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    @GetMapping("/delete/{id}")
    public R deleteById(@PathVariable Integer id) {
        gameInfoService.deleteById(id);
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
            gameInfoService.deleteByIds(idList);
        }
        return R.success();
    }
    /**
     * 根据ID更新
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    @PostMapping("/update")
    public R updateById(GameInfoReq req) {
        gameInfoService.updateById(req);
        return R.success();
    }

}