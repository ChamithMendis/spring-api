package com.chamith.Repository;

import com.chamith.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository implements CrudRepository<Course> {

    @Override
    public List<Course> findAll() {
        List<Course> courses = new ArrayList<>();
        Course springBoot = new Course(1, "spring boot", "spring boot", "link");
        courses.add(springBoot);
        return courses;
    }
}
