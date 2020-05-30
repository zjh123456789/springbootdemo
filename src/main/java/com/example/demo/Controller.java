package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:     SpringBoot 测试
 * @Author:         Zhujinghui
 * @CreateDate:     2018/11/6 15:25
 */
@RestController
@RequestMapping("/demo/")
public class Controller {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;
    @Value("${content}")
    private String content;

    @RequestMapping("say")
    public String sayString(){
        return "hello Springboot! name: " + content;
    }
}
