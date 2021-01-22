package com.springrest.springrest.controller;

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

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	@CrossOrigin
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.courseService.getCourses();
	}
	
	@CrossOrigin
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId)
	{
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@CrossOrigin
	@PostMapping("/courses")
	public Course addCourses(@RequestBody Course course)
	{
		return this.courseService.addCourse(course);
	}
	
	@CrossOrigin
	@PutMapping("/courses")
	public Course updateCourses(@RequestBody Course course)
	{
		return this.courseService.updateCourse(course);
	}
	
	@CrossOrigin
	@DeleteMapping("/courses/{courseId}")
	public List<Course> deleteCourse(@PathVariable String courseId){
		return this.courseService.deleteCourse(Long.parseLong(courseId));
	}
	
}
