package com.atguigu.springcloud;/**
 * @author Xtl
 * @create 2022-12-23-20:01
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *@ClassName ConfigClientMain3355
 *@Description TODO
 *@Author xtl
 *@Date 2022-12-2320:01
 *@Version 1.0
 **/
@EnableEurekaClient
@SpringBootApplication
@RefreshScope
public class ConfigClientMain3355 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3355.class, args);
    }
}
