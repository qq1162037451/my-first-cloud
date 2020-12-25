package com.xiaojiang.springcloudalibaba.service;

import com.george.springcloud.entities.CommonResult;
import com.george.springcloud.entities.Payment;
import com.xiaojiang.springcloudalibaba.service.impl.OpenfeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-payment-provider", fallback = OpenfeignServiceFallback.class)
public interface OpenfeignService {
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
