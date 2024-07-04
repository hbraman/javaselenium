package com.ObjectCasting;

public class Bestfriend extends UpcastFriend {

	public void oldfriend() {
		System.out.println("Balram");

	}

	public static void main(String[] args) {
		UpcastFriend up = new Bestfriend();// Upcasting
		up.oldfriend();// child class typecast to parent class
		up.newfriend();

		/*
		 * Bestfriend bf=new UpcastFriend();//Down casting bf.newfriend();//can't
		 * convert parent to child //not possible
		 */

		/*
		 * Bestfriend bf=new Bestfriend();//normal bf.oldfriend(); bf.newfriend();
		 */
	}

}
