package cn.com.patter.decoration.simple;

public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 添加的状态
	 */
	private String addState;
	
	public String getAddState() {
		return addState;
	}

	public void setAddState(String addState) {
		this.addState = addState;
	}

	public void operation(){
		//调用父类的方法,调用前执行一些附加操作.
		//在这里进行处理的时候,可以使用添加的状态
		super.operation();
	}
}
