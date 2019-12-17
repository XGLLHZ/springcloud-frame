package org.huangzi.frame.consumer.error;

import org.huangzi.frame.consumer.service.TestService;
import org.springframework.stereotype.Component;

/**
 * @author: XGLLHZ
 * @date: 2019/12/16 下午6:20
 * @description: 测试 testservice 接口异常类
 */
@Component
public class TestError implements TestService {

    @Override
    public String test() {
        return "服务 frame-provider 发生故障！";
    }

}
