package com.chamith.config;

import com.chamith.Repository.CourseRepository;
import com.chamith.service.CourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.chamith")
public class AppConfig {

//    @Bean
//    public CourseService courseService() {
//        return new CourseService(courseRepository());
//    }
//
//    @Bean
//    public CourseRepository courseRepository() {
//        return new CourseRepository();
//    }
}
