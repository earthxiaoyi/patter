package cn.com.patter.observer.demo2;

public class Watcher implements WatcherObserver{

	private String job;
	
	@Override
	public void update(WaterQualitySubject subject) {
		// TODO Auto-generated method stub
		System.out.println(job+" 获取到通知，当前污染级别为："+subject.getPolluteLevel());
	}

	@Override
	public void setJob(String job) {
		// TODO Auto-generated method stub
		this.job=job;
	}

	@Override
	public String getJob() {
		// TODO Auto-generated method stub
		return job;
	}

}
