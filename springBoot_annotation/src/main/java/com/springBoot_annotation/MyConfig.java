package com.springBoot_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.Date;

@Configuration
@ComponentScan(basePackages = {"myPack"})
public class MyConfig {

    @Bean("student1")
    @Lazy
    public Student getStudent() {
        return new Student("Student1");
    }

    @Bean("student2")
    public Student createStudent() {
        return new Student("Studnet2");
    }

    @Bean
    public Date getDate() {
        System.out.println("Creating new Date object");
        return new Date();
    }
}
