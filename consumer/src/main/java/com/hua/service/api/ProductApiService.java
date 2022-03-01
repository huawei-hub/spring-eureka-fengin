package com.hua.service.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="producer")
public interface ProductApiService {
    @GetMapping("/getUser")
    String getUser();

//    @RequestMapping(value="/payment/get/{id}",method = RequestMethod.GET)
//    CommonResult getPayment(@PathVariable("id") Long id);
}