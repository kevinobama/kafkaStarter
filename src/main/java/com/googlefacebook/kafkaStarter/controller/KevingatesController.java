package com.googlefacebook.kafkaStarter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KevingatesController {

    @RequestMapping("/")
    public String index() {
        return "welcome the US one";
    }
}