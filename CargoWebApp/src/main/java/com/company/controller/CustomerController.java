package com.company.controller;

import com.company.dao.CustomerRepository;
import com.company.form.CustomerForm;
import com.company.helper.Helper;
import com.company.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/shop")
    public ModelAndView shop() {
        ModelAndView modelAndView = new ModelAndView("shopping");
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/register")
    public ModelAndView registerPage() {
        ModelAndView modelAndView = new ModelAndView("register");
        modelAndView.addObject("register", new CustomerForm());
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/register")
    public ModelAndView addCustomer(@Valid @ModelAttribute("register") CustomerForm form, BindingResult bindingResult) {
        ModelAndView model = new ModelAndView("register");
        if (bindingResult.hasErrors()) {
            return model;
        }

        if (form.getPassword().equals(form.getConfirmPassword())) {
            Customer customer = Helper.mapToEntity(form,new Customer());

            Customer control = customerRepository.save(customer);

            if(control!=null){
                ModelAndView success = new ModelAndView("login");
                success.addObject("message","success");
                return success;
            }

        }

        return model;
    }

}
