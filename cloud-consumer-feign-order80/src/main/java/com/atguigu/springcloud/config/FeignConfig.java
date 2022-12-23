package com.atguigu.springcloud.config;/**
 * @author Xtl
 * @create 2022-12-18-14:46
 */

import ch.qos.logback.classic.LoggerContext;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *@ClassName FeignConfig
 *@Description TODO
 *@Author xtl
 *@Date 2022-12-1814:46
 *@Version 1.0
 **/
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
