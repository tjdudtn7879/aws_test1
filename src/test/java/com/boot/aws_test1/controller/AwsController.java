package com.boot.aws_test1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@Sl
public class AwsController {
    @GetMapping("/aws/v1")
    public String hello(){
//        log.info("/aws/v1 이 호출되었어요.");

        return"<h1>aws v1 호출</h1>";
    }
}
