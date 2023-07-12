package com.example.springapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Model.Employee;
import com.example.springapp.Service.EmployeeService;

@RestController
public class ApiController {
    
 @Autowired
 EmployeeService employeeService; 

@PostMapping("/")
public boolean addEmployee(@RequestBody Employee employee)
{
    System.out.println("helloworld");
   return employeeService.addEmployee(employee);
}

@GetMapping("/")
public List <Employee> getAllEmployees()
{
    System.out.println("helloworld");
    return employeeService.getAllEmployees();
}

@GetMapping("/{id}")
public Employee getEmployeeById(@PathVariable int id)
{
    System.out.println("helloworld");
    return employeeService.getEmployeeById(id);
}
    
}
