package com.ab.java.designpattern.observer;

interface ISubject {
	void register(IObserver o);
	void unregister(IObserver o);
	void notifyObservers();
}
