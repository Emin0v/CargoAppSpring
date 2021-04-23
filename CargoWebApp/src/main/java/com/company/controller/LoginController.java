package com.company.controller;

import com.company.dao.CustomerRepository;
import com.company.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET , value = "/")
    public ModelAndView index(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Customer customer =null;
        if(authentication.getName()!="anonymousUser") {
             customer = customerRepository.findByEmail(authentication.getName()).get();
        }
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("customer",customer);

        return mv;
    }


}
