package com.vijay.TypesOfInheritances;

public class HirarchicalInheritance {
	void m1() {
		System.out.println("Parent!!!");
	}
}

class Child1 extends HirarchicalInheritance {
	void m2() {
		System.out.println("child - 1");
	}
}

class Child2 extends HirarchicalInheritance {
	void m3() {
		System.out.println("child  - 2");
	}
}

class Child3 extends HirarchicalInheritance {
	void m4() {
		System.out.println("child - 3");
	}
}
