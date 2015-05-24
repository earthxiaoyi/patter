package cn.com.patter.decoration.demo1;

import java.util.Date;

import cn.com.patter.decoration.TempDB;

/**
 * 计算团队奖金的策略模式
 * @author JM
 *
 */
public class GroupPrizeDecorator extends Decoration {

	public GroupPrizeDecorator(Component c) {
		super(c);
	}

	public double calcPrize(String user ,Date startTime,Date endTime){
		double money = super.calcPrize(user, startTime, endTime);
		double group=0.0;
		for(double d:TempDB.mapMonthSaleMoney.values()){
			group+=d;
		}
		double prize = group*0.01;
		System.out.println(user+"当月团队奖金为:"+prize);
		return money+prize;
	}
}
