package com.ab.java.designpattern.observer;

class ObserverPatternEx {
	public static void main(String[] args) {
		System.out.println("****Observer pattern demo****");
		Observer o1 = new Observer();
		Subject s1 = new Subject();
		s1.register(o1);
		System.out.println("Setting flag = 5");
		s1.setFlag(5);
		System.out.println("Setting flag = 25");
		s1.setFlag(25);
		s1.unregister(o1);
		System.out.println("Setting flag = 50");
		s1.setFlag(50);
	}
}
