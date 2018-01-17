package com.jenkins.fantasyFootball.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BowlGameController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
