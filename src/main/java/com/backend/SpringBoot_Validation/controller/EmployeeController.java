package com.backend.SpringBoot_Validation.controller;

import com.backend.SpringBoot_Validation.entity.Employee;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @PostMapping("/")
    public ResponseEntity<String> getEmployee(@Valid @RequestBody Employee employee) {
        return new ResponseEntity<> (
                "Employee Added successfully"+
                        "id -"+employee.getId()+
                        "name - "+employee.getEmployeeName()+
                        "emailId -"+employee.getEmailId()+
                        "salary- "+employee.getSalary()+
                        "qualifications -"+employee.getQualifications(),
                HttpStatus.CREATED
        );

    }
}
