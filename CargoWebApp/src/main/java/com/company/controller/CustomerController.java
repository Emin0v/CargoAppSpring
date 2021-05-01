package com.company.controller;

import com.company.dto.OrderForm;
import com.company.model.*;
import com.company.service.GlobalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    @Autowired
    private GlobalService globalService;

    private String username;

    @RequestMapping(method = RequestMethod.GET, value = "/order")
    public ModelAndView indexOrder() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        username=authentication.getName();

        ModelAndView modelAndView = new ModelAndView("order");

        modelAndView.addObject("orderAuth",username);
        modelAndView.addObject("user",globalService.customerService.findByEmail(username).get());
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.POST , value = "/order")
    public ModelAndView toOrder(OrderForm form){
        ModelAndView modelAndView = new ModelAndView("order");
        globalService.orderService.order(form);

        modelAndView.addObject("orderAuth",username);
        modelAndView.addObject("clearAllOrders",1);

        return modelAndView;
    }


}
