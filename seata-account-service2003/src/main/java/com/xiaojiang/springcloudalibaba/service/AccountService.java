package com.xiaojiang.springcloudalibaba.service;

import com.xiaojiang.springcloudalibaba.domain.CommonResult;

import java.math.BigDecimal;

public interface AccountService {

    CommonResult decrease(Long userId, BigDecimal money);
}
