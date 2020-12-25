package com.xiaojiang.springcloudalibaba.service.impl;

import com.xiaojiang.springcloudalibaba.OrderDao;
import com.xiaojiang.springcloudalibaba.domain.Order;
import com.xiaojiang.springcloudalibaba.service.AccountService;
import com.xiaojiang.springcloudalibaba.service.OrderService;
import com.xiaojiang.springcloudalibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class orderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;

    @Override
    @GlobalTransactional(name = "my_test_transactional", rollbackFor = Exception.class)
    public void createOrder(Order order) {
        log.info("开始新建订单....");
        orderDao.create(order);

        log.info("订单微服务开始调用库存扣减....");
        storageService.decrease(order.getProductId(), order.getCount());

        log.info("订单微服务开始调用余额扣减....");
        accountService.decrease(order.getUserId(), order.getMoney());

        log.info("修改订单状态开始....");
        orderDao.update(order.getUserId(), 0);

        log.info("该订单结束");
    }
}
