package com.example.Course.Registration.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.repository.CourseRegistryRepository;
import com.example.Course.Registration.System.repository.CourseRepository;

@Service
public class CourseService
{
	@Autowired
	CourseRepository courserepository;
	
	@Autowired
	CourseRegistryRepository courseregistryrepo;
	
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return courserepository.findAll();
	}

	public List<CourseRegistry> getAllRegistry() {
		// TODO Auto-generated method stub
		return courseregistryrepo.findAll();
	}

	public void enrollcourse(String name, String emailid, String courseName) {
		// TODO Auto-generated method stub
		CourseRegistry courseregistry=new CourseRegistry(name,emailid,courseName);
		courseregistryrepo.save(courseregistry);
	}

	public String deletecourseregistrybyid(int id) {
		// TODO Auto-generated method stub
		courseregistryrepo.deleteById(id);
		return "deleted...";
	}
	
}
