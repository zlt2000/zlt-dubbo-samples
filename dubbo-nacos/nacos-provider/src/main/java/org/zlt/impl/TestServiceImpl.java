package org.zlt.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.zlt.api.ITestService;

/**
 * dubbo api 实现类
 *
 * @author zlt
 * @version 1.0
 * @date 2023/2/17
 * <p>
 * Blog: https://zlt2000.gitee.io
 * Github: https://github.com/zlt2000
 */
@DubboService(version = "1.0")
public class TestServiceImpl implements ITestService {
    @Override
    public String test(String name) {
        System.out.println("greeting service received: " + name);
        return "hello, " + name;
    }
}
