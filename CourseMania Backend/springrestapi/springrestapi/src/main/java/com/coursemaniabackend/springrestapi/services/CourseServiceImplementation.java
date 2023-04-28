package com.coursemaniabackend.springrestapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coursemaniabackend.springrestapi.dao.CourseDao;
import com.coursemaniabackend.springrestapi.entities.Course;

@Service
public class CourseServiceImplementation implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImplementation() {
		
	}
	
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll(); // This findAll() function returns list of all courses present in database
	}
	
	@Override
	public Course getCourse(long courseId) {
		return courseDao.getReferenceById(courseId); // This getReferenceById() function returns a single course whose id is given
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course); // This save() function adds the course
		return course;
	}
	
	@Override
	public Course updateCourse(Course updateCourse) {
		courseDao.save(updateCourse); // This save() function also works as an updater. If a course is present in database then it simply updates the details or  if a course is not present in database then it simply adds a new course
		return updateCourse;
	}

	@Override
	public Course deleteCourse(long courseId) {
		Course deleteCourse=courseDao.getReferenceById(courseId); // Gets the course whose id is given
		courseDao.delete(deleteCourse); // This delete() function deletes the course
		return deleteCourse;
	}
}
