package cn.com.patter.facade;

public class Business {
	
	public void generate(){
		ConfigModel cm = ConfigManager.getInstance().getConfigData();
		if(cm.isNeedGenBusiness()){
			System.out.println("正在生成业务逻辑代码。。。");
		}
	}
	
}
