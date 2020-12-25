package com.xiaojiang.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "feign-response" )
public interface T1Service {

    @GetMapping(value = "/test/t1")
    String test(@RequestParam("para") String s);
}
