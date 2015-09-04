package cn.com.patter.chain.demo1;

public class GeneralManager extends Handler {

	@Override
	public String handlerFreeRequest(String user, double free) {
		String str="";
		if(free>=2000){
			str+="总经理同意"+user+"的"+free+"元餐费报销";
			return str;
		}else{
			if(null!=this.successor){
				return this.successor.handlerFreeRequest(user, free);
			}
		}
		return str;
	}

}
