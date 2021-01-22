package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
//	List<Course> list;
//	
//	public CourseServiceImpl() {
//		list =new ArrayList<>();
//		list.add(new Course(145,"java Course","First Course"));
//		list.add(new Course(146,"Spring boot","Second Course"));
//	}
	
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();  
	}

	@Override
	public Course getCourse(Long courseId) {
//		Course i=null;
//		
//		for(Course c:list)
//		{
//			if(c.getCourseID()==courseId)
//			{
//				i=c;
//				break;		
//			}
//		}
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		return courseDao.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
//		Course i =null;
//		for(Course c:list)
//		{
//			System.out.println("ArrayList before update: "+c);
//			if(course.getCourseID()==c.getCourseID() || course.getCourseDescription()==c.getCourseDescription() || course.getCourseTitle()==c.getCourseTitle())
//			{
//				i=c;
//				break;
//			}
//		}
//		list.remove(i);
//		list.add(course);
		
		return courseDao.save(course);
	}

	@Override
	public List<Course> deleteCourse(Long courseId) {
//		Course i =null;
//		for(Course c:list)
//		{
//			System.out.println("ArrayList before update: "+c);
//			if(c.getCourseID()==courseId)
//			{
//				i=c;
//				break;
//			}
//		}
//		list.remove(i);
		Course deleteSelected = courseDao.getOne(courseId);
		courseDao.delete(deleteSelected);
		return courseDao.findAll();
	}

	

}
