package com.example.empmanager.configuration;

import com.example.empmanager.model.Employee;
import com.example.empmanager.repository.EmployeeRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
public class DataFiller {

    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository) {
        return args -> {
            employeeRepository.save(new Employee("John Doe", "john@gmail.com", "Junior Developer",
                    "+37272378221", "https://www.bootdey.com/img/Content/avatar/avatar2.png"));
            employeeRepository.save(new Employee("Peter Jones", "peter@gmail.com", "Manual Tester",
                    "+37272573957", "https://www.bootdey.com/img/Content/avatar/avatar1.png"));
            employeeRepository.save(new Employee("Bill Russel", "bill@gmail.com", "Product Owner",
                    "+37272573920", "https://www.bootdey.com/img/Content/avatar/avatar3.png"));
        };
    }
}

