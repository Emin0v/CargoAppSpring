package com.company.controller;

import com.company.dao.CustomerRepository;
import com.company.form.CustomerForm;
import com.company.model.Customer;
import com.company.service.inter.CustomerServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class ProfileController {

    @Autowired
    private CustomerServiceInter service;

    @Autowired
    private CustomerRepository repository;

    @RequestMapping(method = RequestMethod.GET, value = "/profile")
    public ModelAndView profile() {
        ModelAndView model = new ModelAndView("profile");

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Customer customer = repository.findByEmail(authentication.getName()).get();

        model.addObject("customer",new CustomerForm(customer));
        model.addObject("profileform",new CustomerForm(customer));
        return model;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/profile")
    public ModelAndView updateCustomer(@Valid @ModelAttribute("profileform") CustomerForm form, BindingResult bindingResult) {
        ModelAndView model = new ModelAndView("profile");

        if (bindingResult.hasErrors()) {
            return model;
        }
        Customer dbCustomer = repository.findById(form.getCustomerNumber()).get();

        Customer customer = form.toCustomer();
        customer.setPassword(dbCustomer.getPassword());

        Boolean control = service.updateCustomer(customer);

        if (control) {
            model.addObject("message","success");
        }
        return model;
    }


}
