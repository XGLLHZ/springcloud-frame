package org.huangzi.frame.consumer.service;

import org.huangzi.frame.consumer.error.TestError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: XGLLHZ
 * @date: 2019/12/12 下午3:19
 * @description: 测试服务消费者事务层接口
 */
@FeignClient(value = "frame-provider", fallback = TestError.class)
public interface TestService {

    @RequestMapping("/api31/provide/test/hello")
    String test();

}
