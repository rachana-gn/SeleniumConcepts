package com.sg.seleniumconcepts;

public class ObjectsDay5 {

	public static void main(String[] args) {
	

		int a=10;
		
		String b="hello";
		
		double c=10.2;
		
		Object z=a;//boxing
		
		Object y=b;
		
		Object x=c;
		
		int res= (int)z;//unboxing
		System.out.println(res);
		
	}

}
