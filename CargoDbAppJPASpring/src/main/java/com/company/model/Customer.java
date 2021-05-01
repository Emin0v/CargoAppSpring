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
@Table(name = "customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "customer_number")
    private Integer customerNumber;
    @Basic(optional = false)
    @Column(name = "customer_name")
    private String customerName;
    @Basic(optional = false)
    @Column(name = "customer_surname")
    private String customerSurname;
    @Basic(optional = false)
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "city")
    private String city;
    @Column(name = "postal_code")
    private String postalCode;
    @Basic(optional = false)
    @Column(name = "country")
    private String country;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "credit_limit")
    private BigDecimal creditLimit;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "customer")
    private Payment payment;
    @JoinColumn(name = "sales_rep_employee_number", referencedColumnName = "employee_number")
    @ManyToOne
    private Employee salesRepEmployeeNumber;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerNumber")
    private List<Order1> order1List;

    // elave
    @ManyToMany(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "customer_number")},
            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")})
    private List<Role> roles;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerNumber != null ? customerNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.customerNumber == null && other.customerNumber != null) || (this.customerNumber != null && !this.customerNumber.equals(other.customerNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.model.Customer[ customerNumber=" + customerNumber + " ]";
    }
    
}
