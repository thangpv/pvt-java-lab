package com.pvt.collection.lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add("Hello");
		list.add(3);
		
		Collections.reverse(list);
		
		for (Object object : list) {
			System.out.println(object);
		}
	}

}
