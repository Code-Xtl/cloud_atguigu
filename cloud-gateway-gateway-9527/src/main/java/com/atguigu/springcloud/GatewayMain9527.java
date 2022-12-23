package com.atguigu.springcloud;/**
 * @author Xtl
 * @create 2022-12-23-13:03
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *@ClassName GatewayMain9527
 *@Description TODO
 *@Author xtl
 *@Date 2022-12-2313:03
 *@Version 1.0
 **/
@EnableEurekaClient
@SpringBootApplication
public class GatewayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(GatewayMain9527.class,args);
    }
}