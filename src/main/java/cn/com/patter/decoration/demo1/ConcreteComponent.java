package cn.com.patter.decoration.demo1;

import java.util.Date;

import cn.com.patter.decoration.demo1.Component;

public class ConcreteComponent extends Component {

	@Override
	public double calcPrize(String user, Date startTime, Date endTime) {
		//默认实现,没有奖金
		return 0;
	}
}
