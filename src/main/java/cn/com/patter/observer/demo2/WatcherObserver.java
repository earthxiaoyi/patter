package cn.com.patter.observer.demo2;

public interface WatcherObserver {
	
	/**
	 * 被通知的对象
	 * @param subject 被传入观察的目标对象
	 */
	public void update(WaterQualitySubject subject);
	
	/**
	 * 设置观察人员的职务
	 * @param job 观察人员的职务
	 */
	public void setJob(String job);
	/**
	 * 获得观察人员的职务
	 * @return 职务
	 */
	public String getJob();
	
	
}
