package com.company.service;

import com.company.service.inter.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GlobalService {

    @Autowired
    public CustomerServiceInter customerService;

    @Autowired
    public EmployeeServiceInter employeeService;

    @Autowired
    public OfficeServiceInter officeService;

    @Autowired
    public OrderdetailServiceInter orderdetailService;

    @Autowired
    public OrderServiceInter orderService;

    @Autowired
    public ProductServiceInter productService;

    @Autowired
    public ProductlineServiceInter productlineService;

}
