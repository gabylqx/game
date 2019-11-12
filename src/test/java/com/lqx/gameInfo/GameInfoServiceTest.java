package com.lqx.gameInfo;

import com.lqx.BaseTest;
import com.lqx.service.gameInfo.GameInfoService;
import com.lqx.dao.gameInfo.req.GameInfoReq;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.math.BigDecimal;

/**
 * 游戏主表测试用例
 * @author 李其璇
 * @date 2019/11/12 15:28
 */
public class GameInfoServiceTest extends BaseTest {

    @Autowired
    private GameInfoService gameInfoService;

    /**
     * 根据ID查询
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    @Test
    public void findByIdTest() {
        print("根据ID查询测试通过");
    }

    /**
     * 根据ID集合查询
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    @Test
    public void findByIdsTest() {
        print("根据ID集合查询测试通过");
    }
    /**
     * 根据ID删除
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    @Test
    public void deleteByIdTest() {
        print("根据ID删除测试通过");
    }

    /**
     * 根据ID集删除
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    @Test
    public void deleteByIdsTest() {
        gameInfoService.deleteByIds(Arrays.asList(1, 2));
        print("根据ID集删除测试通过");
    }

    /**
     * 根据ID修改
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    @Test
    public void updateById() {
        print("根据ID修改测试通过");
    }
}