package cn.com.patter.decoration.demo1;

import java.util.Date;

import cn.com.patter.decoration.TempDB;
/**
 * 装饰器对象 计算月奖金
 * @author JM
 *
 */
public class MonthPrizeDecorator extends Decoration {

	public MonthPrizeDecorator(Component c) {
		super(c);
	}

	public double calcPrize(String user,Date startTime,Date endTime){
		//取出奖金
		double money = super.calcPrize(user, startTime, endTime);
		//计算当月业务奖金,按人员和时间去获取当月业务额,然后再乘以3%;
		double prize= TempDB.mapMonthSaleMoney.get(user)*0.03;
		System.out.println("当月业务奖金 "+user+"=="+prize);
		return money+prize;
	}
}
