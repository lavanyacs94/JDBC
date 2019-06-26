package com.sql;

import java.util.Map;

public class Sample {
	public static void main(String[] args) {
		
		Map<String,Employee> e = getData();
		Employee e1=e.get(10);
		System.out.println(e1.getuname());
		System.out.println(e1.getpname());

	}

	private static Map<String, Employee> getData() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public void getpname(String pname2) {
		// TODO Auto-generated method stub
		
	}
	public void getuname(String uname2) {
		// TODO Auto-generated method stub
		
	}
	public char[] getuname() {
		// TODO Auto-generated method stub
		return null;
	}
	public char[] getpname() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
