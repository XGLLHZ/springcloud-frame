package org.huangzi.frame.consumers.service;

import org.huangzi.frame.consumers.error.TestError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: XGLLHZ
 * @date: 2019/12/13 下午11:09
 * @description: 测试事务层-二号
 */
@FeignClient(value = "frame-providers", fallback = TestError.class)
public interface TestService {

    @RequestMapping("/api32/provides/test/hello")
    String test();

}
