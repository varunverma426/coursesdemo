package com.springrest.springrest.Services;

import java.util.List;

import com.springrest.springrest.entites.course;

public interface CourseService {

   public List<course> getCourses();

    public course getCourseById(long courseId);

	public course addCourse(course courses);
	
	public course updateCourse(course courses);

	public String deleteCourse(long courseId);
}
