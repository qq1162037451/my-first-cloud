package com.xiaojiang.springcloudalibaba.service.impl;

import com.george.springcloud.entities.CommonResult;
import com.george.springcloud.entities.Payment;
import com.xiaojiang.springcloudalibaba.service.OpenfeignService;
import org.springframework.stereotype.Component;

@Component
public class OpenfeignServiceFallback implements OpenfeignService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(4444, "-----OpenfeignServiceFallback 降级处理--------", new Payment(1L, "error serial"));
    }
}
