package org.huangzi.frame.providers.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: XGLLHZ
 * @date: 2019/12/13 下午11:00
 * @description: 测试前端控制器-二号
 */
@RestController
@RequestMapping("/provides/test")
public class TestController {

    @RequestMapping("/hello")
    public String test() {
        return "I am from providers server!";
    }

}
