package cn.com.patter.observer.demo;

public class NewsPaper extends Subject{
	/**
	 * 报纸的内容
	 */
	private  String content;

	/**
	 * 获取报纸的具体内容
	 * @return 报纸的具体内容
	 */
	public String getContent() {
		return content;
	}
	
	/**
	 * 设定报纸的具体内容，出版报纸
	 * @param content 报纸的内容
	 */
	public void setContent(String content) {
		this.content = content;
		//通知所有读者
		notifyAllObservers();
	}
}
