package cn.com.patter.observer.demo2;

import java.util.ArrayList;
import java.util.List;

public abstract class WaterQualitySubject {
	//保存注册的观察者对象
	protected List<WatcherObserver> list = new ArrayList<WatcherObserver>();
	
	public void attach(WatcherObserver observer){
		list.add(observer);
	}
	
	public void removeAttach(WatcherObserver observer){
		list.remove(observer);
	}
	/**
	 * 通知相应的观察者对象
	 */
	public abstract void notifyAllObserver();
	/**
	 * 获取水质级别
	 * @return 水质级别
	 */
	public abstract int getPolluteLevel();
	
}
