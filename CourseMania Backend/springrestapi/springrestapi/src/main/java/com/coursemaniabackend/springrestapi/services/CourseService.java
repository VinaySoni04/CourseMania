package com.coursemaniabackend.springrestapi.services;

import java.util.List;

import com.coursemaniabackend.springrestapi.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses(); // We creating interface to make loose coupling, in simple words, for making coupling easier
	
	public Course getCourse(long courseId); 
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public Course deleteCourse(long courseId);
}
