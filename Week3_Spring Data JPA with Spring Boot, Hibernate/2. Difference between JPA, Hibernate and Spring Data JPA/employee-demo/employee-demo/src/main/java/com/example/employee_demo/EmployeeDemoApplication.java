package com.example.employee_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@SpringBootApplication
public class EmployeeDemoApplication implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(EmployeeDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Employee emp1 = new Employee("Subalakshmi", "Development", 50000.0);
        Employee emp2 = new Employee("Ravi", "Testing", 45000.0);

        employeeService.addEmployee(emp1);
        employeeService.addEmployee(emp2);

        System.out.println("Employees saved successfully.");
    }
}
