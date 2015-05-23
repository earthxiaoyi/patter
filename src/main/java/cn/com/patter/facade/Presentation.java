package cn.com.patter.facade;
/**
 * 示意生成表现层模块
 * @author JM
 *
 */
public class Presentation {
	
	public void generate(){
		//获取配置信息	
		ConfigModel cm = ConfigManager.getInstance().getConfigData();
		if(cm.isNeedGenPresentation()){
			System.out.println("正在生成表现层代码文件");
		}
	}
}
