package com.vijay.inheritance;

public class NewwDemo222 extends Student{
	int panNo;
	void disp(){
		System.out.println("pan No "+panNo);
	}
	public static void main(String[] args) {
		NewwDemo222 nd  = new NewwDemo222();
		nd.show();
		nd.disp();
	}
}
