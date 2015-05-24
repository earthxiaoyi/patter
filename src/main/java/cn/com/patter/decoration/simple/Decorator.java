package cn.com.patter.decoration.simple;

public abstract class Decorator extends Component {
	/**
	 * 持有组件对象
	 */
	protected Component component;
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		//转发请求给组件对象
		component.operation();
	}
	/**
	 * 构造方法 传入 组件对象
	 * @param component
	 */
	public Decorator(Component component) {
		this.component=component;
	}
}
