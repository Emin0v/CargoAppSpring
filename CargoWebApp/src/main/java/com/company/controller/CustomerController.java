package com.company.controller;

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
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(method = RequestMethod.GET , value = "/login")
    public String login(){
        return "login";
    }

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
            Customer customer = new Customer();
            customer.setCustomerName(form.getCustomerName());
            customer.setCustomerSurname(form.getCustomerSurname());
            customer.setPhone(form.getPhone());
            customer.setPostalCode(form.getPostalCode());
            customer.setAddress(form.getAddress());
            customer.setCity(form.getCity());
            customer.setCountry(form.getCountry());
            customer.setEmail(form.getEmail());
            customer.setPassword(form.getPassword());

            Customer control = customerRepository.save(customer);

            if(control!=null){
                ModelAndView success = new ModelAndView("login");
                success.addObject("message","Successful registration");
                return success;
            }

        }

        return model;
    }

}
