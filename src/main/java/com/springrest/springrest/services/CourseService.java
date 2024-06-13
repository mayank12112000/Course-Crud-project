package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;

import com.springrest.springrest.model.Course;

public interface CourseService {
	public List<Course> getCourses();

	public Optional<Course> getCourse(long courseId);

	public Course addCourse(Course course);

	public void deleteCourse(long courseID);

	public Course updateCourse(Course course);
	
}
