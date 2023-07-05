package com.example.springapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.Model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    
}
