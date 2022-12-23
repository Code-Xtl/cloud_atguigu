package com.atguigu.springcloud.service;/**
 * @author Xtl
 * @create 2022-12-18-21:43
 */

/**
 *@ClassName PaymentFallbackService
 *@Description TODO
 *@Author xtl
 *@Date 2022-12-1821:43
 *@Version 1.0
 **/

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentRemoteHystrixService{
    @Override
    public String testHystrixOk(Integer id) {
        return "ok";
    }

    @Override
    public String testHystrixTimeout(Integer id) throws InterruptedException {
        return "timeout";
    }
}
