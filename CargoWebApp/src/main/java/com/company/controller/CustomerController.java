package com.company.controller;

import com.company.dto.CustomerForm;
import com.company.dto.OrderDTO;
import com.company.model.Customer;
import com.company.service.inter.CustomerServiceInter;
import com.company.service.inter.OrderServiceInter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerServiceInter customerService;

    @Autowired
    private OrderServiceInter orderService;

    @Autowired
    private ModelMapper modelMapper;

    @RequestMapping(method = RequestMethod.GET , value = "/myorders")
    public ModelAndView showMyOrders(@RequestParam(value = "userId") String userIdStr){
        ModelAndView model = new ModelAndView("myorders");
        Integer userId = Integer.valueOf(userIdStr);
        List<OrderDTO> orderDTOList = orderService.findByCustomerNumber(userId);
        model.addObject("orders",orderDTOList);

        return model;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profile")
    public ModelAndView profile() {
        ModelAndView model = new ModelAndView("profile");

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Customer customer = customerService.findByEmail(authentication.getName()).get();

        model.addObject("customer", new CustomerForm(customer));
        model.addObject("profileform", new CustomerForm(customer));
        return model;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/profile")
    public ModelAndView updateCustomer(@Valid @ModelAttribute("profileform") CustomerForm form, BindingResult bindingResult) {
        ModelAndView model = new ModelAndView("profile");

        if (bindingResult.hasErrors()) {
            return model;
        }
        Customer dbCustomer = customerService.findById(form.getCustomerNumber()).get();

        Customer customer = modelMapper.map(form,Customer.class);
        customer.setPassword(dbCustomer.getPassword());

        Boolean control = customerService.updateCustomer(customer);

        if (control) {
            model.addObject("message", "success");
        }
        return model;
    }
}
