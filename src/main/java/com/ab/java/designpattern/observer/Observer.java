package com.ab.java.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Observer {
	public void update() {
		System.out.println("flag value changed in Subject");
	}
}

interface ISubject {
	void register(Observer o);
	void unregister(Observer o);
	void notifyObservers();
}

class Subject implements ISubject {
	List<Observer> observerList = new ArrayList<Observer>();
	private int flag;
	
	public int getFlag() {
		return flag;
	}
	
	public void setFlag(int flag) {
		this.flag = flag;
		notifyObservers();
	}

	public void register(Observer o) {
		observerList.add(o);
	}

	public void unregister(Observer o) {
		observerList.remove(o);
	}

	public void notifyObservers() {
		for (int i = 0; i < observerList.size(); i++) {
			observerList.get(i).update();
		}
	}
}

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