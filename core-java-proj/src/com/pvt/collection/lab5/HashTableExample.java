package com.pvt.collection.lab5;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.pvt.collection.lab4.Employee;

public class HashTableExample {
	
	public static void main(String[] args) {
		Employee e1 = new Employee("E1", 10);
		Employee e2 = new Employee("E2", 1000);
		Employee e3 = new Employee("E3", 100);
		Employee e4 = new Employee("E4", 10000);
		Employee e5 = new Employee("E1", 10);
		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Map<Employee, Integer> map = new Hashtable<Employee, Integer>();
		map.put(e1, 1);
		map.put(e2, 2);
		map.put(e3, 3);
		map.put(e4, 4);
		map.put(e5, 5);
		
		for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();) {
			Employee entry = (Employee) iterator.next();
			System.out.println(entry.getName() + ": " + entry.getSalary());
		}
		
		System.out.println("Iterate over Map.Entry:");
		for (Map.Entry<Employee, Integer> entry : map.entrySet())
		{
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}
	}

}
