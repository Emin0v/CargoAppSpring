package com.company.controller;

import com.company.form.OrderForm;
import com.company.model.*;
import com.company.service.GlobalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;

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

        Order1 order = new Order1();
        Orderdetail orderdetail = new Orderdetail();
        Product product = new Product();
        Productline productline = new Productline();

        order.setOrderDate(new Date());
        order.setStatus("sifariş olundu");
        order.setComments(form.getComments());
        order.setCustomerNumber(globalService.customerService.findById(form.getCustomerNumber()).get());

        orderdetail.setCount(form.getCount());
        orderdetail.setColor(form.getColor());
        orderdetail.setSize(form.getSize());
        orderdetail.setPrice(BigDecimal.valueOf(Integer.parseInt(form.getTotalPrice())));
        orderdetail.setOrder1(order);
        orderdetail.setProductCode(product);

        product.setBuyPrice(BigDecimal.valueOf(Integer.parseInt(form.getPrice())));
        product.setProductVendor(getDomainName(form.getLink()));
        product.setProductline(productline);

        productline.setProductline("Turkey-Azerbaijan");
        productline.setImage(form.getImage());

        globalService.productlineService.add(productline);
        globalService.productService.addProduct(product);
        globalService.orderService.add(order);
        globalService.orderdetailService.addOrderdetail(orderdetail);


        modelAndView.addObject("orderAuth",username);
        modelAndView.addObject("clearAllOrders",1);

        return modelAndView;
    }

    private static String getDomainName(String url){
        try {
            URI uri = new URI(url);
            String domain = uri.getHost();
            return domain.startsWith("www.") ? domain.substring(4) : domain;
        }catch (URISyntaxException ex){
            ex.printStackTrace();
            return url;
        }
    }

}
