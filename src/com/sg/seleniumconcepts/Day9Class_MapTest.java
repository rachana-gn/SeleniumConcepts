package com.sg.seleniumconcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day9Class_MapTest {

	public static void main(String[] args) {
		
		//for single record
		Map<String, String> map1 = new HashMap<>();
		map1.put("firstname", "Test");
		map1.put("lastname", "User");
		map1.put("dob", "2021-8-18");
		map1.put("gender", "Male");
		
		
		//multiple records
		
		Map<String, String> map2 = new HashMap<>();
		map2.put("firstname", "Test1");
		map2.put("lastname", "User1");
		map2.put("dob", "2021-8-18");
		map2.put("gender", "Female");
		
		//we cannnot creat so we use list
		
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		list.add(map1);
		list.add(map2);
		
		String gender = list.get(0).get("gender");//0th index consists data of Test user which is in row1
		System.out.println(gender);
		
		
		String gender1 = list.get(1).get("gender");//Index 1 consists data of Test user1 which is in row2
		System.out.println(gender1);
		
		
		
		String valueOfDOB = map1.get("dob");
		
		System.out.println(valueOfDOB);
		

	}

}
