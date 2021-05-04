package com.company.service.impl;

import com.company.dao.CustomerRepository;
import com.company.dao.OrderRepository;
import com.company.dto.OrderDTO;
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

    public boolean add(Order1 order) {
        orderRepository.save(order);
        return true;
    }

    @Override
    public OrderDTO getOrder(int orderNumber) {
        Order1 order = orderRepository.findById(orderNumber).get();
        return new OrderDTO(order);
    }

    @Override
    public boolean order(OrderForm form) {

        Product product = Product
                .builder()
                .buyPrice(BigDecimal.valueOf(Double.parseDouble(form.getPrice())))
                .productVendor(getDomainName(form.getLink()))
                .build();

        Orderdetail orderdetail = Orderdetail
                .builder()
                .count(form.getCount())
                .color(form.getColor())
                .size(form.getSize())
                .price(BigDecimal.valueOf(Double.parseDouble(form.getTotalPrice())))
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

    private static String getDomainName(String url) {
        try {
            URI uri = new URI(url);
            String domain = uri.getHost();
            return domain.startsWith("www.") ? domain.substring(4) : domain;
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
            return url;
        }
    }


}
