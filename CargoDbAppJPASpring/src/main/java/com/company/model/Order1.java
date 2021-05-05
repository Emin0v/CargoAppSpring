package com.company.model;

import lombok.*;
import org.hibernate.criterion.Order;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Eminov
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "`order`")
public class Order1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "`order_number`")
    private Integer orderNumber;
    @Basic(optional = false)
    @Column(name = "order_date")
    @Temporal(TemporalType.DATE)
    private Date orderDate;
    @Column(name = "required_date")
    @Temporal(TemporalType.DATE)
    private Date requiredDate;
    @Column(name = "shipped_date")
    @Temporal(TemporalType.DATE)
    private Date shippedDate;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    @Column(name = "link")
    @Basic(optional = false)
    private String link;
    @Lob
    @Column(name = "comments")
    private String comments;
    @JoinColumn(name = "customer_number", referencedColumnName = "customer_number")
    @ManyToOne(optional = false)
    private Customer customerNumber;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "order1")
    private Orderdetail orderdetail;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderNumber != null ? orderNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Order1)) {
            return false;
        }
        Order1 other = (Order1) object;
        if ((this.orderNumber == null && other.orderNumber != null) || (this.orderNumber != null && !this.orderNumber.equals(other.orderNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Order1{" +
                "orderNumber=" + orderNumber +
                ", orderDate=" + orderDate +
                ", requiredDate=" + requiredDate +
                ", shippedDate=" + shippedDate +
                ", status='" + status + '\'' +
                ", comments='" + comments + '\'' +
                ", customerNumber=" + customerNumber +
                ", orderdetail=" + orderdetail +
                '}';
    }
}
