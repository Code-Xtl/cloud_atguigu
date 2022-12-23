package com.atguigu.springcloud.controller;/**
 * @author Xtl
 * @create 2022-12-14-16:06
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 *@ClassName OrderZkController
 *@Description TODO
 *@Author xtl
 *@Date 2022-12-1416:06
 *@Version 1.0
 **/
public class OrderZkController {
    public static final String INVOKE_URL = "http://cloud-provider-payment";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo() {
        String result = restTemplate.getForObject(INVOKE_URL+"/payment/zk", String.class);
        return result;
    }
}
