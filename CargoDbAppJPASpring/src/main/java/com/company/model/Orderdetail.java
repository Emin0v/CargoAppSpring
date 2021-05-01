package com.company.model;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

/**
 * @author Eminov
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "orderdetail")
public class Orderdetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "`order_number`")
    private Integer orderNumber;
    @Basic(optional = false)
    @Column(name = "count")
    private int count;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "color")
    private String color;
    @Column(name = "size")
    private String size;
    @Basic(optional = false)
    @Column(name = "price")
    private BigDecimal price;
    @JoinColumn(name = "order_number", referencedColumnName = "order_number", insertable = false, updatable = false)
    @OneToOne
    private Order1 order1;
    @JoinColumn(name = "product_code", referencedColumnName = "product_code")
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private Product productCode;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderNumber != null ? orderNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orderdetail)) {
            return false;
        }
        Orderdetail other = (Orderdetail) object;
        if ((this.orderNumber == null && other.orderNumber != null) || (this.orderNumber != null && !this.orderNumber.equals(other.orderNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.model.Orderdetail[ orderNumber=" + orderNumber + " ]";
    }

}
