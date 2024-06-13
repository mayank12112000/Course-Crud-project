package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Dao.CourseDao;
import com.springrest.springrest.model.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	
	
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll(); 
	}

	@Override
	public Optional<Course> getCourse(long courseId) {
		return courseDao.findById(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		return courseDao.save(course);
	}

	@Override
	public  void deleteCourse(long courseId) {
		Course course = courseDao.getOne(courseId);
		courseDao.delete(course);
		
	}

	@Override
	public Course updateCourse(Course courseToAdd) {
		return courseDao.save(courseToAdd);
	}

}
