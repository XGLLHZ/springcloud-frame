package org.huangzi.frame.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: XGLLHZ
 * @date: 2019/12/12 下午3:13
 * @description: 测试服务提供者接口
 */
@RestController
@RequestMapping("/provide/test")
public class TestController {

    @RequestMapping("/hello")
    public String test() {
        return "I am from provide server!";
    }

}
