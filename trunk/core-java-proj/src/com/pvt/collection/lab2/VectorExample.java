package com.pvt.collection.lab2;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * 
 * @author Pham Vu Thang
 *
 */
public class VectorExample {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add("Hello");
		list.add(3);
		
		Vector v = new Vector(list);
		Object[] arr = new Object[v.size()];
		
		int i = 0;
		for (Enumeration enumeration = v.elements(); enumeration.hasMoreElements();) {
			Object object = (Object) enumeration.nextElement();
			System.out.println(object);
			
			arr[i] = object;
			i++;
		}
		
		// Print out the copied array
		System.out.println("--------------------------");
		System.out.println("New Array: ");
		for(Object obj : arr ) {
			System.out.println(obj);
		}
		
		
		
	}
	
}
