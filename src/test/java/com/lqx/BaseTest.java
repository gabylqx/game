package com.lqx;

import net.sf.json.JSONObject;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 测试类基类
 * @author 李其璇
 * @date 2019/11/12 15:28
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class BaseTest {

    protected Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * 打印测试结果
     * @author 李其璇
     * @date 2019/11/12 15:28
     */
    protected void print(Object obj) {
        log.info(JSONObject.fromObject(obj).toString());
    }
}