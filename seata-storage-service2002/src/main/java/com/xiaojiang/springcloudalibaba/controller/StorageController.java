package com.xiaojiang.springcloudalibaba.controller;

import com.xiaojiang.springcloudalibaba.domain.CommonResult;
import com.xiaojiang.springcloudalibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class StorageController {

    @Resource
    private StorageService storageService;

    @RequestMapping(value = "/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        log.info("--------------");
        storageService.decrease(productId, count);
        return new CommonResult(200, "扣减库存成功");
    }
}
