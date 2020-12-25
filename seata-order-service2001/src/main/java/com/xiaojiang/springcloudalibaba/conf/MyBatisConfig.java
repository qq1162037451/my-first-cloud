package com.xiaojiang.springcloudalibaba.conf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan({"com.xiaojiang.springcloudalibaba.dao"})
public class MyBatisConfig {

}

