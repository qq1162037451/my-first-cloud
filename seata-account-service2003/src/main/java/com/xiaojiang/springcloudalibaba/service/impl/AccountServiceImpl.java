package com.xiaojiang.springcloudalibaba.service.impl;

import com.xiaojiang.springcloudalibaba.dao.AccountDao;
import com.xiaojiang.springcloudalibaba.domain.CommonResult;
import com.xiaojiang.springcloudalibaba.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    public CommonResult decrease(Long userId, BigDecimal money) {

        log.info("扣减余额正式开始...");
        accountDao.decrease(userId, money);
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("扣减余额结束..");
        return new CommonResult(200, "扣减余额成功");
    }
}
