package com.vijay.TypesOfInheritances;

public class Multilevel {
	void show() {
		System.out.println("Parent class!!!");
	}
}

class Child extends Multilevel {
	void disp() {
		System.out.println("child class!!!!");
	}
}

class SubChild extends Child {
	void display() {
		System.out.println("sub - child class");
	}
}
