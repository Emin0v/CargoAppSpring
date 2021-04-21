package com.company.controller;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.company.dao.CustomerRepository;
import com.company.form.RegisterForm;
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
public class RegisterController {

    @Autowired
    private CustomerRepository customerRepository;

    public BCrypt.Hasher crypt = BCrypt.withDefaults();

    @RequestMapping(method = RequestMethod.GET, value = "/register")
    public ModelAndView registerPage() {
        ModelAndView modelAndView = new ModelAndView("register");
        modelAndView.addObject("register", new RegisterForm());
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/register")
    public ModelAndView addCustomer(@Valid @ModelAttribute("register") RegisterForm form, BindingResult bindingResult) {
        ModelAndView model = new ModelAndView("register");
        if (bindingResult.hasErrors()) {
            return model;
        }

        if (form.getPassword().equals(form.getConfirmPassword())) {
            Customer customer = form.toCustomer();

            customer.setPassword(crypt.hashToString(4, form.getPassword().toCharArray()));

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
