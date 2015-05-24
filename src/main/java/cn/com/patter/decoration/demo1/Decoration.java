package cn.com.patter.decoration.demo1;

import java.util.Date;

public abstract class Decoration extends Component {
	//持有被装饰的组件对象
	protected Component c;
	
	@Override
	public double calcPrize(String user, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return c.calcPrize(user, startTime, endTime);
	}
	/**
	 * 通过构造方法传入被装饰的对象
	 * @param c 被装饰的对象
	 */
	public Decoration(Component c){
		this.c=c;
	}

}
