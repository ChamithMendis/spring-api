package com.chamith;

import com.chamith.config.AppConfig;
import com.chamith.model.Course;
import com.chamith.service.CourseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        CourseService courseService = new CourseService();
//        System.out.println(courseService.list());

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CourseService courseService = context.getBean(CourseService.class);
        System.out.println(courseService.list());
    }
}
