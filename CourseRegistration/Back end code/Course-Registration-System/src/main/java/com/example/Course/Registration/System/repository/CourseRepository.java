package com.example.Course.Registration.System.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Course.Registration.System.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,String>
{

}
