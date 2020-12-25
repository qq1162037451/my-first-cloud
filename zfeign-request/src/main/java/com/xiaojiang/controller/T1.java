package com.xiaojiang.controller;

import com.xiaojiang.service.T1Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class T1 {

    @Resource
    private T1Service t1Service;

    @GetMapping("/test/t1")
    public String t1(@RequestParam("para") String s) {
        System.out.println("开始...........");
        return t1Service.test(s);
    }

}
