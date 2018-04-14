package com.ab.java.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

class Subject implements ISubject {
	List<IObserver> observerList = new ArrayList<IObserver>();
	private int flag;
	
	public int getFlag() {
		return flag;
	}
	
	public void setFlag(int flag) {
		this.flag = flag;
		notifyObservers();
	}

	public void register(IObserver o) {
		observerList.add(o);
	}

	public void unregister(IObserver o) {
		observerList.remove(o);
	}

	public void notifyObservers() {
		for (int i = 0; i < observerList.size(); i++) {
			observerList.get(i).update(this.flag);
		}
	}
}
