package com.company.dto;

import com.company.model.Customer;
import com.company.model.Payment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDTO {

    private Integer customerNumber;
    private int checkNumber;
    private Date paymentDate;
    private BigDecimal amount;

    public PaymentDTO(Payment payment){
        this.customerNumber = payment.getCustomerNumber();
        this.checkNumber = payment.getCheckNumber();
        this.paymentDate = payment.getPaymentDate();
        this.amount = payment.getAmount();
    }
}
