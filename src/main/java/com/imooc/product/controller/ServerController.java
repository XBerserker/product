package com.imooc.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lt on 2018/10/1.
 */
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String message(){
        return "this is a message 1";
    }
}
