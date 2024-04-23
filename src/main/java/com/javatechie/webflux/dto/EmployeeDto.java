package com.javatechie.webflux.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "tbl_employee")
public class EmployeeDto {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
}
