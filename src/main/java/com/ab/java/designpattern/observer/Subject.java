package com.ab.java.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

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
