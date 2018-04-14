package com.ab.java.designpattern.observer;

interface ISubject {
	void register(Observer o);
	void unregister(Observer o);
	void notifyObservers();
}
