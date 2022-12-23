package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.services.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @Autowired
    private PaymentHystrixService paymentHystrixService;

    @RequestMapping("/test/hystrix/ok/{id}")
    public String testHystrixOk(@PathVariable("id") Integer id){
        return paymentHystrixService.testHystrixOk(id);
    }

    @RequestMapping("/test/hystrix/timeout/{id}")
    public String testHystrixTimeout(@PathVariable("id") Integer id) throws InterruptedException {
        return paymentHystrixService.testHystrixTimeout(id);
    }
    @HystrixCommand(fallbackMethod = "testRongDuan_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),  //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),   //请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "20000"),  //时间范围
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")}//失败率达到多少后跳闸
    )
    @RequestMapping("/test/hystrix/rongduan/{id}")
    public String testRongDuan(@PathVariable("id") Integer id){
        if (id < 0){
            // 这样做的目的是让他去执行兜底方法
            throw new RuntimeException("id 不能为负数");
        }
        return "服务执行成功! id: " + id;
    }

    public String testRongDuan_fallback(@PathVariable Integer id){

        return "id 不能为负数,降级服务执行…………  id:" + id;
    }
}