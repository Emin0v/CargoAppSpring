package com.company.dto;


import com.company.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleDTO {

    private Integer id;
    private String role;

    public RoleDTO(Role role){
        this.id = role.getId();
        this.role = role.getRole();
    }

}
