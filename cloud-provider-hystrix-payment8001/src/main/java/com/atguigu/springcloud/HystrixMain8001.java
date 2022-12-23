package com.atguigu.springcloud;/**
 * @author Xtl
 * @create 2022-12-18-19:16
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 *@ClassName HystrixMain8001
 *@Description TODO
 *@Author xtl
 *@Date 2022-12-1819:16
 *@Version 1.0
 **/
@EnableEurekaClient
@SpringBootApplication
@EnableCircuitBreaker
public class HystrixMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixMain8001.class,args);
    }
}