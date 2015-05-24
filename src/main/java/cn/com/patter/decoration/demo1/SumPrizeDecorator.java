package cn.com.patter.decoration.demo1;

import java.util.Date;
/**
 * 装饰器对象,计算累计奖金
 * @author JM
 *
 */
public class SumPrizeDecorator extends Decoration {

	public SumPrizeDecorator(Component c) {
		super(c);
	}
	
	public double calcPrize(String user ,Date startTime,Date endTime){
		//1 先获取前面运算出来的奖金
		double money = super.calcPrize(user, startTime, endTime);
		//2.计算累计奖金
		double prize = 1000000*0.001;
		System.out.println(user+" 累计奖金"+prize);
		return money+prize;
	}
}
