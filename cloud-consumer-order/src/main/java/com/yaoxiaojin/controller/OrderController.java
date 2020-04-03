package com.yaoxiaojin.controller;

import com.yaoxiaojin.entities.CommonResult;
import com.yaoxiaojin.entities.Payment;
import com.yaoxiaojin.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 订单服务
 *
 * @author yaoxiaojin
 */
@RestController
@Slf4j
public class OrderController {

    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "/order/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        return paymentService.getPayment(id);
    }
}
