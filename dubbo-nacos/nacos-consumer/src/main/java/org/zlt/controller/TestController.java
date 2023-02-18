package org.zlt.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zlt.api.ITestService;

/**
 * @author zlt
 * @version 1.0
 * @date 2023/2/17
 * <p>
 * Blog: https://zlt2000.gitee.io
 * Github: https://github.com/zlt2000
 */
@RestController
public class TestController {
    @DubboReference(version = "1.0")
    private ITestService testService;

    @GetMapping(value = "/test")
    public String test(String name) {
        System.out.println("TestController received: " + name);
        return testService.test(name);
    }
}
