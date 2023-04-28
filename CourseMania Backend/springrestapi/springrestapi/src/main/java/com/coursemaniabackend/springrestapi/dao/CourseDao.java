package com.coursemaniabackend.springrestapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coursemaniabackend.springrestapi.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {
	// No need to write anything here, jpa repository do all works
}
