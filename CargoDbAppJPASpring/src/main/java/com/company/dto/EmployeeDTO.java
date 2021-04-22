package com.company.dto;

import com.company.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    private Integer employeeNumber;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private String jobTitle;
    private OfficeDTO officeCode;

    public EmployeeDTO(Employee employee){
        this.employeeNumber = employee.getEmployeeNumber();
        this.name = employee.getName();
        this.surname = employee.getSurname();
        this.phone = employee.getPhone();
        this.email = employee.getEmail();
        this.jobTitle = employee.getJobTitle();
        this.officeCode = new OfficeDTO(employee.getOfficeCode());
    }

}
