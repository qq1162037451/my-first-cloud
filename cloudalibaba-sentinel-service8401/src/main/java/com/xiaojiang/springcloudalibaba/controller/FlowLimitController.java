package com.xiaojiang.springcloudalibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {

        return "------testB";
    }

    @GetMapping("/testHotpoint")
    @SentinelResource(value = "testHotpoint", blockHandler = "testHotpointHandler")
    public String testHotpoint(@RequestParam(value = "p1", required = false) String p1,
                               @RequestParam(value = "p2", required = false) String p2) {

        return "------testHotpoint normal---------";
    }

    public String testHotpointHandler(String p1, String p2, BlockException blockException) {

        return "------testHotpoint exception handler---------";
    }
}
