package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.Services.CourseService;
import com.springrest.springrest.entites.course;

@RestController    //Telling the spring that this is Controller class
public class MyController {
	
	//@GetMapping("/home")
	//public String home() {
	//	return "Welcome to Home Application";
	//}
	@Autowired  //Used to automaticallly creates object
	private CourseService service;
	
	@GetMapping("/course")  //For Get call use this annotation
	public List<course> getCourses(){
		return this.service.getCourses();
	}
	
	@GetMapping("/courseById/{courseId}")
	public course getCourseById(@PathVariable String courseId) {
		
		return this.service.getCourseById(Long.parseLong(courseId));
	}
	
    @PostMapping("/addCourse")
	public course addCourse(@RequestBody course courses) {
    	return this.service.addCourse(courses);
		
	}
    
	@PutMapping("/updateCourse")
	public course updateCourse(@RequestBody course courses) {
		return this.service.updateCourse(courses);
		
	}
	
	@DeleteMapping("/deleteCourse/{courseId}")
	public String deleteCourse(@PathVariable String courseId) {
		return this.service.deleteCourse(Long.parseLong(courseId));
	}


}
 