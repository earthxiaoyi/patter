package cn.com.patter.observer;

public class ConcreteObserver implements Observer {
	
	private String observerState;
	/**
	 * 具体的更新实现。
	 * 这里需要更新观察者的状态，使其与目标的状态保持一致。
	 */
	public void update(Subject subject) {
		observerState = ((ConcreteSubject)subject).getSubjectState();
	}

}
