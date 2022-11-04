package com.emc.lists;

import java.util.*;

public class TeacherList {
	List<Teacher> teachers;

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public void display() {
		System.out.println("Teachers...." + "");
		
		for (Teacher t:teachers) {
			System.out.println(t.getId());
			System.out.println(t.getName());
		}
	}
	
	

	

}
