package org.PolyOverLoading;

public class Employe_Details {
	public void employe() {
		System.out.println("Employe Details:");
	}
	public void employe(int a) {
		System.out.println(a);
	}
	public void employe(int a,String b){
		System.out.println(a+b);
	}
	public void employe(String b,int a) {
		System.out.println(b+a);
	}
	public static void main(String[] args) {
		Employe_Details ed=new Employe_Details();
		ed.employe();
		ed.employe(10);
		ed.employe(20, "Ramu");
		ed.employe("age:",23);
		
	}
		
	

}
