package com.xiaojiang.springcloudalibaba.controller;

import com.xiaojiang.springcloudalibaba.domain.CommonResult;
import com.xiaojiang.springcloudalibaba.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RestController
public class AccountController {

    @Resource
    private AccountService accountService;

    @RequestMapping(value = "/account/decrease")
    public CommonResult decrease(Long userId, BigDecimal money) {
        accountService.decrease(userId, money);
        return new CommonResult(200, "扣减余额成功");
    }
}
