package com.backend.SpringBoot_Validation.entity;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Employee {
    @NotBlank(message = "Can not blank id")
     private Long id;
    @NotBlank(message = "Name can not be Blank")
     private String employeeName;
    @Max(value = 10000, message = "Salary must be greater than 10000")
     private Double salary;

    @NotEmpty(message = "Qualifications can not be Empty")
     private List<String> qualifications;

     @Email(message = "Not valid Email Format")
     private String emailId;

}
