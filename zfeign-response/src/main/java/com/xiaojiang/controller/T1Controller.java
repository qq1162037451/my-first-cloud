package com.xiaojiang.controller;

import com.xiaojiang.service.T1Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class T1Controller {


    @Resource
    private T1Service t1Service;

    @GetMapping(value = "/test/t1")
    public String test(String para) {
        System.out.println("开始.............");
        return t1Service.t1(para);
    }
}
