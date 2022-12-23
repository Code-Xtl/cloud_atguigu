package com.atguigu.springcloud.dao;/**
 * @author Xtl
 * @create 2022-12-13-14:57
 */

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 *@ClassName PaymentDao
 *@Description TODO
 *@Author xtl
 *@Date 2022-12-1314:57
 *@Version 1.0
 **/
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}