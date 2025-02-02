package com.example.Course.Registration.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Course.Registration.System.model.CourseRegistry;

public interface CourseRegistryRepository extends JpaRepository<CourseRegistry,Integer>
{
	
}
