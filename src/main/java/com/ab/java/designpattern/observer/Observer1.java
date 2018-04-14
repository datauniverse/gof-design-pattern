package com.ab.java.designpattern.observer;

public class Observer1 implements IObserver {
	public void update(int i) {
		System.out.println("Observer1: myValue in subject is " + i);
	}
}