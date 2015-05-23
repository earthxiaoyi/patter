package cn.com.patter.observer.demo2;

/**
 * 具体水质监测对象
 * 
 * @author JM
 *
 */
public class WaterQuality extends WaterQualitySubject {
	/**
	 * 0:正常 1：轻度污染 2：中度污染 3：严重污染
	 */
	private int polluteLevel = 0;

	@Override
	public void notifyAllObserver() {
		// TODO Auto-generated method stub
		for (WatcherObserver w : list) {

			if (this.polluteLevel >= 0) {
				if ("检测人员".equals(w.getJob())) {
					w.update(this);
				}
			}

			if (this.polluteLevel >= 1) {
				if ("预警人员".equals(w.getJob())) {
					w.update(this);
				}
			}

			if (this.polluteLevel >= 2) {
				if ("监测部门领导".equals(w.getJob())) {
					w.update(this);
				}
			}

		}
	}

	@Override
	public int getPolluteLevel() {
		// TODO Auto-generated method stub
		return polluteLevel;
	}

	public void setPolluteLevel(int polluteLevel) {
		this.polluteLevel = polluteLevel;
		this.notifyAllObserver();
	}
}
