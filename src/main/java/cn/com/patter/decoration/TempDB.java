package cn.com.patter.decoration;

import java.util.HashMap;
import java.util.Map;

public class TempDB {
	private TempDB(){
		
	}
	//记录人月销售额度
	public static Map<String,Double> mapMonthSaleMoney=new HashMap<String,Double>();
	
	static{
		//填充数据
		mapMonthSaleMoney.put("张三", 10000.0);
		mapMonthSaleMoney.put("李四", 20000.0);
		mapMonthSaleMoney.put("王五", 30000.0);
	}
}
