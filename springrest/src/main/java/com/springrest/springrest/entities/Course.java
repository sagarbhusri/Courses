package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	private long courseID;
	private String courseTitle;
	private String courseDescription;
	
	
	public Course(long courseID, String courseTitle, String courseDescription) {
		super();
		this.courseID = courseID;
		this.courseTitle = courseTitle;
		this.courseDescription = courseDescription;
	}
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getCourseID() {
		return courseID;
	}
	public void setCourseID(long courseID) {
		this.courseID = courseID;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	@Override
	public String toString() {
		return "course [courseID=" + courseID + ", courseTitle=" + courseTitle + ", courseDescription="
				+ courseDescription + "]";
	}
	
}
