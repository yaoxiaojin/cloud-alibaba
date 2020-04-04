package com.yaoxiaojin.controller;

import com.yaoxiaojin.entities.CommonResult;
import com.yaoxiaojin.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 支付服务
 *
 * @author yaoxiaojin
 */
@RestController
@Slf4j
public class PaymentController {

    @GetMapping(value = "/payment/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        log.info("payment method is running");
        CommonResult<Payment> result = new CommonResult(200, "success");
        return result;
    }

}
