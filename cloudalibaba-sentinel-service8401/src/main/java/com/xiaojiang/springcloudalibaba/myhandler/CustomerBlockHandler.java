package com.xiaojiang.springcloudalibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.george.springcloud.entities.CommonResult;
import com.george.springcloud.entities.Payment;

public class CustomerBlockHandler {
    public static CommonResult handlerException1(BlockException e) {
        return new CommonResult(4444, "自定义异常处理--------1", new Payment(2020L, "serial001"));
    }

    public static CommonResult handlerException2(BlockException e) {
        return new CommonResult(4444, "自定义异常处理--------2", new Payment(2020L, "serial001"));
    }
}
