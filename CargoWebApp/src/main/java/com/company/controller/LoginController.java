package com.company.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class LoginController {

    @RequestMapping(method = RequestMethod.GET , value = "/login")
    public String login(){
        return "login";
    }

    

}
