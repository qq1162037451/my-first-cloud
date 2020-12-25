package com.xiaojiang.springcloudalibaba.service.impl;

import com.xiaojiang.springcloudalibaba.dao.StorageDao;
import com.xiaojiang.springcloudalibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Slf4j
@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {

        log.info("扣减库存操作正式开始");
        storageDao.decrease(productId, count);
        log.info("扣减库存操作结束");
    }
}
