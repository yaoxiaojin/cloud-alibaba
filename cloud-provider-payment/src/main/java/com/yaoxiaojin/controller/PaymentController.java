package com.yaoxiaojin.controller;

import com.yaoxiaojin.entities.CommonResult;
import com.yaoxiaojin.entities.Payment;
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
public class PaymentController {

    @GetMapping(value = "/payment/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        CommonResult<Payment> result = new CommonResult(200, "success");
        return result;
    }

}
