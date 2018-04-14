package com.ab.java.designpattern.observer;

public class Observer2 implements IObserver {
	public void update(int i) {
		System.out.println("Observer2: myValue in subject is " + i);
	}
}
