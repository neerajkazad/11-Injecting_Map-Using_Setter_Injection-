package com.im.beans;

import java.util.Map;

public class College {
	private Map<String,String> facultySubjects;

	public void setFacultySubjects(Map<String, String> facultySubjects) {
		this.facultySubjects = facultySubjects;
	}

	@Override
	public String toString() {
		return "College [facultySubjects=" + facultySubjects + "]";
	}
	
	
}
