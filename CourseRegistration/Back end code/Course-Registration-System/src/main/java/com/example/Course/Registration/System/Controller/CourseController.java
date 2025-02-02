package com.example.Course.Registration.System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.service.CourseService;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500") 
public class CourseController
{
	@Autowired
	CourseService courseservice;
	
	@GetMapping("/course")
	public List<Course> getAllCourses()
	{
		return courseservice.getAllCourses();
	}
	//getting registered student details
	@GetMapping("/course/registry")
	public List<CourseRegistry> getAllRegistry()
	{
		return courseservice.getAllRegistry();
	}
	//enrolling the course
	@PostMapping("/course/enroll")
	public String enrollcourse(@RequestParam("name") String name,
								@RequestParam("emailid") String emailid,
								@RequestParam("CourseName") String courseName)
	{
		courseservice.enrollcourse(name,emailid,courseName);
		return "Congratulation, "+name+" enrollment successfull for "+courseName;
	}
	
	//delete registry student details
	@DeleteMapping("/course/registry/{id}")
	public String deletecourseregistrybyid(@PathVariable("id") int id)
	{
		return courseservice.deletecourseregistrybyid(id);
		
	}
}
