package com.springrest.springrest.Services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDAO;
import com.springrest.springrest.entites.course;

@Service
public class CourseServiceImpl  implements CourseService{


		List<course> list;
		
		@Autowired
		private CourseDAO courseDAO;
		
		//public CourseServiceImpl() {
//			list =new ArrayList<>();
//			list.add(new course(145,"Physics","Science Project using Mechanics"));
//			list.add(new course(147,"Chemistry","Science Project using Chemicals"));
//			list.add(new course(147,"Biology","Science Project using Hassthmathun"));
			
			
		//}


	@Override
	public List<course> getCourses() {
//		// TODO Auto-generated method stub
//		return list;
		return courseDAO.findAll();
	}


	@Override
	public course getCourseById(long courseId) {
		// TODO Auto
//		course c=null;
//		for(course courses:list) {
//			if(courses.getId()==courseId) {
//				c=courses;
//				break;
//			}
//		}
//		return c;	 
		return courseDAO.findById(courseId).get();
		
	}


	@Override
	public course addCourse(course courses) {
//		list.add(courses);
//		return courses;
		return courseDAO.save(courses);
	}


	@Override
	public course updateCourse(course courses) {
//		list.forEach(e->{
//			if(e.getId()==courses.getId()) {
//				e.setTitle(courses.getTitle());
//				e.setDescription(courses.getDescription());
//			}
//		});
//		return courses;
		return courseDAO.save(courses);//will pass the updated details 
	}


	@Override
	public String deleteCourse(long courseId) {
		// TODO Auto-generated method stub
//	   list.remove(getCourseById(courseId));
//	   return "Record Deleted";
		course entity=courseDAO.getReferenceById(courseId);
		 courseDAO.delete(entity);
		 return "Record Delted";
	}

		

}
