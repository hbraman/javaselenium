package com.Exception;

public class Exception_Handling {
	
	public static void main(String[] args) {
		
		try {
			String a="Hello Ragu24";      //alt+shift+z-->surround with
			Integer c=Integer.valueOf(a);
			System.out.println(++c);
		}
		catch (Exception e) {  //(Throwable e)
			System.err.println("Good");
		}
		finally {
			System.out.println("I am Fine");
		}
		System.out.println("Very Well");
		
		}

}
