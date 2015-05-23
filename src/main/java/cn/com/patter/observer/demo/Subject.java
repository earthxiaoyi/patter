package cn.com.patter.observer.demo;

import java.util.ArrayList;
import java.util.List;
/**
 * 目标对象，他提供观察他的观察者，并提供注册和删除观察者的接口
 * @author admin
 *
 */
public class Subject {
	
	private List<Observer> Observers = new ArrayList<Observer>();
	
	/**
	 * 注册观察者对象
	 * @param observer
	 */
	public void attach(Observer observer){
		Observers.add(observer);
	}
	
	/**
	 * 删除观察者对象
	 * @param observer
	 */
	public void detach(Observer observer){
		Observers.remove(observer);
	}
	
	protected void notifyAllObservers(){
		for(Observer o:Observers){
			o.update(this);
		}
	}
}
