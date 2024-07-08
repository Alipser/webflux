package com.roma.webflux_init.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("users")
public class User {

    private Integer id;
   
    private String firstname;

    private String lastname;
    
    private String password;

    private String phone;

    @Column("role_id")
    private Integer role;

    private String email;

}