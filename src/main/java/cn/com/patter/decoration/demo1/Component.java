package cn.com.patter.decoration.demo1;

import java.util.Date;

public abstract class Component {
	/**
	 * 计算某人在某段时间内的奖金.
	 * @param user 人
	 * @param startTime 开始时间
	 * @param endTime   结束时间
	 * @return 奖金
	 */
	public abstract double calcPrize(String user,Date startTime,Date endTime);
}
