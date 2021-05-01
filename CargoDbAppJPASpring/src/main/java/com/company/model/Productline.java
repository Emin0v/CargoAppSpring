package com.company.model;

import lombok.*;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
@Table(name = "productline")
public class Productline implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "productline")
    private String productline;
    @Lob
    @Column(name = "text_description")
    private String textDescription;
    @Lob
    @Column(name = "html_description")
    private String htmlDescription;
    @Lob
    @Column(name = "image")
    private String image;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productline")
    private List<Product> productList;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productline != null ? productline.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productline)) {
            return false;
        }
        Productline other = (Productline) object;
        if ((this.productline == null && other.productline != null) || (this.productline != null && !this.productline.equals(other.productline))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.model.Productline[ productline=" + productline + " ]";
    }
    
}
