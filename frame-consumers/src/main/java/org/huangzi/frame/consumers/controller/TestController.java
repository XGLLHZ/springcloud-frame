package org.huangzi.frame.consumers.controller;

import org.huangzi.frame.consumers.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: XGLLHZ
 * @date: 2019/12/13 下午11:11
 * @description: 测试前端控制器-二号
 */
@RestController
@RequestMapping("/consumes/test")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/hello")
    public String test() {
        return testService.test();
    }

}
