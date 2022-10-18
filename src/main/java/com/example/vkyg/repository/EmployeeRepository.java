package com.example.vkyg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.vkyg.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
