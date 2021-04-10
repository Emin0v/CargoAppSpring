package com.company.controller;

import com.company.model.Order1;
import com.company.model.Orderdetail;
import com.company.model.Product;
import com.company.model.Productline;
import com.company.service.inter.CustomerServiceInter;
import com.company.service.inter.OrderServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.Date;

@Controller
public class CustomerController {

    @Autowired
    private OrderServiceInter orderService;

    @Autowired
    private CustomerServiceInter customerService;


    @RequestMapping(method = RequestMethod.GET, value = "/order")
    public ModelAndView shop() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        ModelAndView modelAndView = new ModelAndView("order");

        modelAndView.addObject("orderAuth",authentication.getName());
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.POST , value = "/order")
    public ModelAndView toOrder(@RequestParam(value="image") String image,
                                @RequestParam(value = "link") String link,
                                @RequestParam(value = "country") String country,
                                @RequestParam(value = "price") String price,
                                @RequestParam(value = "totalPrice") String totalPrice,
                                @RequestParam(value = "color") String color,
                                @RequestParam(value = "size") String size,
                                @RequestParam(value = "comment" , required = false) String comment,
                                @RequestParam(value = "count") Integer count
                                ){

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        ModelAndView modelAndView = new ModelAndView("order");

        Order1 order = new Order1();
        Orderdetail orderdetail = new Orderdetail();
        Product product = new Product();
        Productline productline = new Productline();


        order.setOrderDate(new Date());
//        order.setStatus("active");
        order.setComments(comment);
        order.setCustomerNumber(customerService.findByEmail(authentication.getName()));
        order.setOrderdetail(orderdetail);

        orderdetail.setCount(count);
        orderdetail.setColor(color);
        orderdetail.setSize(size);
        orderdetail.setPrice(BigDecimal.valueOf(Integer.parseInt(totalPrice)));
        orderdetail.setOrder1(order);
        orderdetail.setProductCode(product);

        product.setBuyPrice(BigDecimal.valueOf(Integer.parseInt(price)));
        product.setProductVendor(link);
        product.setProductline(productline);

        productline.setProductline(link);
        productline.setImage(image);


        orderService.add(order);

        return modelAndView;
    }

}
