package com.codepresso.controllerexercise.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")     // 컨트롤러 클래스에 공통적으로 사용하는 prefix가 있으면 클래스에 Request맵핑으로 공통 사용이 가능하다.
public class UserController {
    @RequestMapping(value = "/paid")      // /user/paid
    public String getPaiUser(){
        return "I'm a paid user";
    }
    @RequestMapping(value = "/enterprise")
    public String getEnterpriseUser(){
        return "I'm a ETUser";
    }

}
