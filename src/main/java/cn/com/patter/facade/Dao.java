package cn.com.patter.facade;

public class Dao {
	public void generate(){
		ConfigModel cm = ConfigManager.getInstance().getConfigData();
		if(cm.isNeedGenDao()){
			System.out.println("正在生成数据访问层代码。。");
		}
	}
}
