package com.Hybrid;

public class Team1 extends Manager{
	
	public void Add() {
		int a=20;
		int b=30;
		int c=40;
		System.out.println("Add:"+"\na=20"+"\nb=30"+"\nc=40"+"\nOutput:"+(a+b+c));
	}
	public static void main(String[] args) {
		Team1 t1=new Team1();
		t1.Calculator();
		t1.project();
		t1.Add();
	}

}
