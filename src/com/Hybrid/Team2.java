package com.Hybrid;

public class Team2 extends Manager{
	public void sub() {
		int a=900;
		int b=500;
		int c=a-b;
		System.out.println("Sub:"+"\na=900"+"\nb=500"+"\nOutput:"+c);
		
	}
	public static void main(String[] args) {
		Team2 t2=new Team2();
		t2.Calculator();
		t2.project();
		t2.sub();
		
	}

}
