package com.vijay.SimpleIneritance;

import java.util.Scanner;

public class Demo {
	static String name;
	void cat(){
		System.out.println("I am CAT");
	}
}
class Simple extends Demo{
	void Dog(){
		System.out.println("Dog name is "+name);
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		 name = sc.nextLine();
		System.out.println("enter the name of dog...");
		Simple s = new Simple();
		System.out.println(s);
		s.Dog();
		s.cat();
		
	}
}
