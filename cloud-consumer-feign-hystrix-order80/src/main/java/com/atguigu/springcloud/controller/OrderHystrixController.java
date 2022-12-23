package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentRemoteHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DefaultProperties(defaultFallback = "globalFallback")
public class OrderHystrixController {
    @Autowired
    private PaymentRemoteHystrixService paymentRemoteHystrixService;

    @HystrixCommand
    @RequestMapping("/consumer/test/hystrix/ok/{id}")
    public String testHystrixOk(@PathVariable("id") Integer id) {
        return paymentRemoteHystrixService.testHystrixOk(id);
    }


    @HystrixCommand
    @RequestMapping("/consumer/test/hystrix/timeout/{id}")
    public String testHystrixTimeout(@PathVariable("id") Integer id) throws InterruptedException {
        return paymentRemoteHystrixService.testHystrixTimeout(id);
    }

    // 兜底方法！
    public String testHystrixTimoutFallback(@PathVariable("id") Integer id) throws InterruptedException {
        return "测试80兜底成功 + testHystrixTimeout() -->" + id;
    }

    public String globalFallback() throws InterruptedException {
        return "测试quanju80兜底成功 + testHystrixTimeout() -->";
    }
}