package com.fuyq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Fuyq BG352929
 * @Date TestController crate at 2019-04-24 13:56
 * @Description TODO
 * @Version 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    private String test(){
        return "hello";
    }
}
