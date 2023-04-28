package com.coursemaniabackend.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.coursemaniabackend.springrestapi.entities.Course;
import com.coursemaniabackend.springrestapi.services.CourseService;

@CrossOrigin // Use this annotation when react app server gives an error "cors restricted" something like that
@RestController
// This controller is present in the presentation layer
public class MyController {
	
	@Autowired  // This annotation creates automatically an object of CourseService and injects it into courseService 
	// Declaring a variable of type CourseService because CourseService is the parent class of CourseServiceImplementation 
	private CourseService courseService;
	
	// @RequestMapping(path="/courses", method=RequestMethod.GET) // We can also write like this
	
	@GetMapping("/courses") // GetMapping annotation maps the getCourses function with "/courses"
	public List<Course> getCourses(){ // This function will gives you all courses
		return this.courseService.getCourses(); // This calls getCourses function from CourseServiceImplementation
	}
	
	@GetMapping("/courses/{courseId}") // This bracket takes a dynamic value
	public Course getCourse(@PathVariable String courseId) { // This function will gives only one course
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses") // PostMapping annotation is used to add or map something new
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}
	
	@PutMapping("/courses") // PutMapping annotation is used to add new course if course is not present in database or update existing course
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.updateCourse(course);
	}
	
	@DeleteMapping("/courses/{courseId}") // DeleteMapping annotation is used to remove or delete something
	public Course deleteCourse(@PathVariable String courseId) { // This function will delete the course whose course id is given
		return this.courseService.deleteCourse(Long.parseLong(courseId));
	}
}
