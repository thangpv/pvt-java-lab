/**
 * 
 */
package com.pvt.collection.lab1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Pham Vu Thang
 *
 */
public class ArrayListIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add("Hello");
		list.add(3);
		
		System.out.println("Iterate by for - each");
		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println("--------------------------");
		
		System.out.println("Iterate by index ");
		for (int i = 0; i < list.size(); i++) {
			Object object = (Object) list.get(i);
			System.out.println(object);
		}
		System.out.println("--------------------------");
		
		System.out.println("Iterate by list.iterator");
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}

	}

}
