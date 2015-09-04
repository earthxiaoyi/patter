package cn.com.patter.chain.demo1;

public class DepManager extends Handler {

	@Override
	public String handlerFreeRequest(String user, double free) {
		String str="";
		if(free>=500 && free<2000){
			str+="部门经理同意报销 "+user+"的"+free+"元聚餐费用";
			return str;
		}else{
			if(null!=this.successor){
				return this.successor.handlerFreeRequest(user, free);
			}
		}
		return str;
	}

}
