package com.company.model;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
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
@Table(name = "product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_code")
    private Integer productCode;
    @Column(name = "product_name")
    private String productName;
    @Basic(optional = false)
    @Column(name = "product_vendor")
    private String productVendor;
    @Lob
    @Column(name = "product_description")
    private String productDescription;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "buy_price")
    private BigDecimal buyPrice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productCode")
    private List<Orderdetail> orderdetailList;
    @Lob
    @Column(name = "image",length=100000)
    private byte[] image;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productCode != null ? productCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.productCode == null && other.productCode != null) || (this.productCode != null && !this.productCode.equals(other.productCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.model.Product[ productCode=" + productCode + " ]";
    }
    
}
