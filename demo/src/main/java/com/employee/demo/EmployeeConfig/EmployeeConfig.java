package com.employee.demo.EmployeeConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.modelmapper.ModelMapper;

@Configuration
public class EmployeeConfig {

    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }
}
