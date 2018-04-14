package com.ab.java.designpattern.observer;

public class ObserverPatternApp {

	public static void main(String[] args) {
		System.out.println("Modified Observer Pattern Demo");
		Subject sub = new Subject();
		Observer1 ob1 = new Observer1();
		Observer2 ob2 = new Observer2();
		
		sub.register(ob1);
		sub.register(ob2);
		
		sub.setFlag(5);
		System.out.println();
		sub.setFlag(25);
		System.out.println();
		
		sub.unregister(ob1);
		sub.setFlag(100);
	}

}
