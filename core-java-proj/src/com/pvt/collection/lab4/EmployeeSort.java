package com.pvt.collection.lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(10D);
		Employee e2 = new Employee(1000D);
		Employee e3 = new Employee(100D);
		Employee e4 = new Employee(10000D);
		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Collections.sort(list);
		
		for (Employee employee : list) {
			System.out.println(employee.getSalary());
		}
	}

}
