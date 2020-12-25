package com.xiaojiang.springcloudalibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.george.springcloud.entities.CommonResult;
import com.george.springcloud.entities.Payment;
import com.xiaojiang.springcloudalibaba.myhandler.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "handlerException")
    public CommonResult byResource() {
        return new CommonResult(200, "按资源名限流测试OK", new Payment(2020L, "serial001"));
    }

    public CommonResult handlerException(BlockException e) {
        return new CommonResult(444, e.getClass().getCanonicalName() + "， 服务不可用", new Payment(2020L, "serial001"));
    }

    @GetMapping("/byUri")
    @SentinelResource(value = "byUri", blockHandlerClass = CustomerBlockHandler.class, blockHandler = "handlerException1")
    public CommonResult byUri() {
        return new CommonResult(200, "按Uri限流测试OK", new Payment(2020L, "serial002"));
    }
}
