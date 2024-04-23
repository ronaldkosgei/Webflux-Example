package com.javatechie.webflux.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "tbl_employee")
public class Employee {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    private String email;
}
