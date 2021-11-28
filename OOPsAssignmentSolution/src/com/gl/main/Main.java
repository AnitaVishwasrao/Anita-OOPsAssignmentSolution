package com.gl.main;

import com.gl.department.*;

public class Main {

	public static void main(String[] args) {

		AdminDepartment adminDepartment = new AdminDepartment();
		HrDepartment hrDepartment = new HrDepartment();
		TechDepartment techDepartment = new TechDepartment();

		// Print Admin Department Messages
		System.out.println("Welcome to" + adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork().trim());
		System.out.println(adminDepartment.getWorkDeadline().trim());
		System.out.println(adminDepartment.isTodayAHoliday().trim() + "\n");

		// Print Hr Department Messages
		System.out.println("Welcome to" + hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity().trim());
		System.out.println(hrDepartment.getTodaysWork().trim());
		System.out.println(hrDepartment.getWorkDeadline().trim());
		System.out.println(hrDepartment.isTodayAHoliday().trim() + "\n\n");

		// Print Tech Department Messages
		System.out.println("Welcome to" + techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork().trim());
		System.out.println(techDepartment.getWorkDeadline().trim());
		System.out.println(techDepartment.getTechStackInformation().trim());
		System.out.println(techDepartment.isTodayAHoliday().trim());
	}

}
