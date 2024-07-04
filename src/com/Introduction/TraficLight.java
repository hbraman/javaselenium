package com.Introduction;

public class TraficLight {
	
	private void stop()	 {
		System.out.println("Red Colour");
		}
	private void ready(){
		System.out.println("Yellow Colour");
		}
	private void go() {
		System.out.println("Green Colour");
		
		}

	public static void main(String[] args) {
		TraficLight t=new TraficLight();
		t.stop();
		t.ready();
		t.go();
	}
}
