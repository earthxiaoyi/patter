package cn.com.patter.facade;
/**
 * 示意配置管理，负责读取配置文件
 * 并把配置文件的内容设置到配置model中去，是个单例
 * @author JM
 *
 */
public class ConfigManager {
	private static ConfigManager manager=null;
	private static ConfigModel cm= null;
	
	private ConfigManager(){};
	
	public static ConfigManager getInstance(){
		if(null==manager){
			manager = new ConfigManager();
			cm=new ConfigModel();
		}
		return manager;
	}
	
	/**
	 * 获取配置的数据
	 * 
	 * @return 配置的数据
	 */
	public ConfigModel getConfigData(){
		return cm;
	}
}
