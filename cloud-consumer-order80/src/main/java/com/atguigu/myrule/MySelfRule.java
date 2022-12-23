package com.atguigu.myrule;/**
 * @author Xtl
 * @create 2022-12-16-12:58
 */

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *@ClassName MySelfRule
 *@Description TODO
 *@Author xtl
 *@Date 2022-12-1612:58
 *@Version 1.0
 **/

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
