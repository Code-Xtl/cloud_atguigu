package com.atguigu.springcloud.services;/**
 * @author Xtl
 * @create 2022-12-18-19:19
 */

/**
 *@InterfaceName PaymentHystrixService
 *@Description TODO
 *@Author xtl
 *@Date 2022-12-1819:19
 *@Version 1.0
 **/
public interface PaymentHystrixService {
    public String testHystrixOk(Integer id);

    public String testHystrixTimeout(Integer id) throws InterruptedException;
}
