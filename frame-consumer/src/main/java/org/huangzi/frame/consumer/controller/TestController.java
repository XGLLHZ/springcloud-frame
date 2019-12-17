package org.huangzi.frame.consumer.controller;

import org.huangzi.frame.consumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: XGLLHZ
 * @date: 2019/12/12 下午3:00
 * @description: 测试前端控制器
 */
@RestController
@RequestMapping("/consume/test")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/hello")
    public String test() {
        return testService.test();
    }

}
