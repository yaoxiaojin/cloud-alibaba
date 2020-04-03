package com.yaoxiaojin.service;

import com.yaoxiaojin.entities.CommonResult;
import com.yaoxiaojin.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "cloud-provider-payment")
public interface PaymentService {

    @GetMapping(value = "/payment/{id}")
    CommonResult<Payment> getPayment(@PathVariable("id") Long id);
}
