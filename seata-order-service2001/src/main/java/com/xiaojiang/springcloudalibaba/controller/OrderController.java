package com.xiaojiang.springcloudalibaba.controller;

import com.xiaojiang.springcloudalibaba.domain.CommonResult;
import com.xiaojiang.springcloudalibaba.domain.Order;
import com.xiaojiang.springcloudalibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping(value = "/order/create")
    public CommonResult createOrder(Order order) {
        orderService.createOrder(order);
        return new CommonResult(200, "订单创建成功");
    }
}
