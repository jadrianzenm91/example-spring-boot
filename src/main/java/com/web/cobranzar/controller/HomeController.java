package com.web.cobranzar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/home")
@RestController
public class HomeController {

    @RequestMapping("hello")
    public String index() {
        return "hello world";
    }

}
