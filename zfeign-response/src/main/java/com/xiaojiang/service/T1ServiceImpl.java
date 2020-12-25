package com.xiaojiang.service;

import org.springframework.stereotype.Service;

@Service
public class T1ServiceImpl implements T1Service{
    @Override
    public String t1(String s) {
        return "TEST SUCESSFUL" + s;
    }
}
