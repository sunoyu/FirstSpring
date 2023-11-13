package com.codepresso.controllerexercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//@RestController     // 아래 문자열이 반환
@Controller    // return 문자열에 해당하는 templete이 보여진다.
public class HelloController {
    @RequestMapping(value = "/")
    public String hello(){
        return "hello";
    }

}
