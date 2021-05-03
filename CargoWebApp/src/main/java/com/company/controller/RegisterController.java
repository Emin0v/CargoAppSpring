package com.company.controller;

import com.company.exception.AuthorAlreadyExistException;
import com.company.dto.RegisterForm;
import com.company.service.inter.CustomerServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class RegisterController {

    @Autowired
    private CustomerServiceInter customerServiceInter;


    @RequestMapping(method = RequestMethod.GET, value = "/register")
    public ModelAndView registerPage() {
        ModelAndView modelAndView = new ModelAndView("register");
        modelAndView.addObject("registerForm", new RegisterForm());
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/register")
    public String register(@Valid @ModelAttribute("registerForm") RegisterForm form,
                           BindingResult bindingResult,
                           ModelMap modelMap) {
        if (bindingResult.hasErrors()) {
            return "register";
        }
        try{
             customerServiceInter.register(form);
             modelMap.addAttribute("message", "success");
             return "login";

        }catch (AuthorAlreadyExistException authorAlreadyExistException){
             return "register";
        }

    }
}
