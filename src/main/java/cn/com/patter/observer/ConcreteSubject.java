package cn.com.patter.observer;
/**
 * 具体的目标对象负责把有关状态存入到相应的观察者对象
 * 并在自己状态发生改变时，通知各个观察者
 * @author admin
 *
 */
public class ConcreteSubject extends Subject {
	
	/**
	 * 目标对象的状态
	 */
	private String subjectState;
	
	
	public String getSubjectState(){
		return subjectState;
	}
	
	public void setSubjectState(String subjectState){
		this.subjectState=subjectState;
		this.notifyAllObservers();
	}
	
	
}
