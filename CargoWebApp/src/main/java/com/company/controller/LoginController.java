package com.company.controller;

import com.company.dao.CustomerRepository;
import com.company.dto.CustomerDTO;
import com.company.model.Customer;
import com.company.service.IAuthenticationFacade;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private IAuthenticationFacade authenticationFacade;

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET , value = "/index")
    public ModelAndView index(){
        Authentication authentication = authenticationFacade.getAuthentication();
        CustomerDTO customer =null;
        if (!(authentication instanceof AnonymousAuthenticationToken)){
            Customer customerDb = customerRepository.findByEmail(authentication.getName()).get();
            customer = modelMapper.map(customerDb,CustomerDTO.class);
        }
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("customer",customer);

        return mv;
    }


}
