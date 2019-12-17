package org.huangzi.frame.consumers.error;

import org.huangzi.frame.consumers.service.TestService;
import org.springframework.stereotype.Component;

/**
 * @author: XGLLHZ
 * @date: 2019/12/16 下午6:35
 * @description: 测试 frame-providers 异常处理
 */
@Component
public class TestError implements TestService {

    @Override
    public String test() {
        return "服务 frame-providers 发生故障！";
    }

}
