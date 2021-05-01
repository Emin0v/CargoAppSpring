package com.company.service.impl;

import com.company.dao.CustomerRepository;
import com.company.dao.OrderRepository;
import com.company.dto.OrderForm;
import com.company.model.*;
import com.company.service.inter.OrderServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;

@Service
@Transactional
public class OrderServiceImpl implements OrderServiceInter {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public Order1 add(Order1 order){
        return orderRepository.save(order);
    }

    @Override
    public Order1 getOrder(int orderNumber) {
       return orderRepository.findById(orderNumber).get();
    }

    @Override
    public boolean order(OrderForm form){

        Productline productline = Productline
                .builder()
                .productline("Turkey-Azerbaijan")
                .image(form.getImage())
                .build();

        Product product = Product
                .builder()
                .buyPrice(BigDecimal.valueOf(Integer.parseInt(form.getPrice())))
                .productVendor(getDomainName(form.getLink()))
                .productline(productline)
                .build();

        Orderdetail orderdetail = Orderdetail
                .builder()
                .count(form.getCount())
                .color(form.getColor())
                .size(form.getSize())
                .price(BigDecimal.valueOf(Integer.parseInt(form.getTotalPrice())))
                .productCode(product)
                .build();

        Order1 order = Order1
                .builder()
                .orderDate(new Date())
                .status(OrderStatus.ORDERED)
                .comments(form.getComments())
                .customerNumber(customerRepository.findById(form.getCustomerNumber()).get())
                .orderdetail(orderdetail)
                .build();

        add(order);

        return true;
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
