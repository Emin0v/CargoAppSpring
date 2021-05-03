package com.company.controller;

import com.company.dto.OrderForm;
import com.company.model.Customer;
import com.company.service.GlobalService;
import com.company.service.IAuthenticationFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderController {

    @Autowired
    private GlobalService globalService;

    @Autowired
    private IAuthenticationFacade authenticationFacade;

    @RequestMapping(method = RequestMethod.GET, value = "/order")
    public ModelAndView indexOrder() {
        Customer customer = authenticationFacade.getCurrentUser();
        ModelAndView modelAndView = new ModelAndView("order");

        modelAndView.addObject("orderAuth",customer.getEmail());
        modelAndView.addObject("user",customer);
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.POST , value = "/order")
    public ModelAndView toOrder(OrderForm form){
        Customer customer = authenticationFacade.getCurrentUser();
        ModelAndView modelAndView = new ModelAndView("order");
        globalService.orderService.order(form);

        modelAndView.addObject("orderAuth",customer.getEmail());
        modelAndView.addObject("clearAllOrders",true);
        return modelAndView;
    }
}
