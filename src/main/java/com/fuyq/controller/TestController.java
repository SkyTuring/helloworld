package com.fuyq.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@RequestMapping("/")
public class TestController {

    public static int count = 0;

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/hello")
    private String test(){
        logger.info("测试日志1：{}",count++);
        return "hello world"+count;
    }


    @GetMapping("/")
    private String test2(){
        logger.info("测试日志2：{}",count++);
        return "hello world!!!!!!!!!!"+count;

    }
}
