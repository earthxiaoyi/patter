package cn.com.patter.chain.demo1;

public class ProjectManager extends Handler {

	@Override
	public String handlerFreeRequest(String user, double free) {
		String str = "";
		if (free < 500) {
			str += "项目经理同意 " + user + " 聚餐费用" + free + " 元报销请求";
			return str;
		} else {
			if (null != this.successor) {
				// 交给有权限的人处理
				return this.successor.handlerFreeRequest(user, free);
			}
		}
		return str;
	}

}
