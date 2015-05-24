package cn.com.patter.decoration.simple;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
	}
	/**
	 * 需要添加的职责
	 */
	public void addedBehavior(){
		//需要添加的职责实现
	}
	
	public void operation(){
		//调用父类的方法 , 调用前后执行一些附加操作.
		super.operation();
		addedBehavior();
	}
}	
