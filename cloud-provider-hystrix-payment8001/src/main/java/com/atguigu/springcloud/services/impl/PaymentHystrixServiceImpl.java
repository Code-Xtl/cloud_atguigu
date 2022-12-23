package com.atguigu.springcloud.services.impl;

import com.atguigu.springcloud.services.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class PaymentHystrixServiceImpl implements PaymentHystrixService {
    @Override
    public String testHystrixOk(Integer id) {
        return "测试成功 + testHystrixOk() -->" + id;
    }

    @Override
    @HystrixCommand(fallbackMethod = "testHystrixTimoutFallback", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String testHystrixTimeout(Integer id) throws InterruptedException {
        Thread.sleep(5000);
        //int i = 3/0;
        return "测试成功 + testHystrixTimeout() -->" + id ;
    }

    // 兜底方法！
    public String testHystrixTimoutFallback(@PathVariable("id") Integer id) throws InterruptedException {
        return "测试兜底成功 + testHystrixTimeout() -->" + id ;
    }



}