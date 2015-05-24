package cn.com.patter.decoration.simple;
/**
 * 具体实现组件对象接口的对象
 * @author JM
 *
 */
public class ConcreteComponent extends Component {
	
	@Override
	public void operation() {
		//相应的处理功能
		System.out.println("hello");
	}

}
