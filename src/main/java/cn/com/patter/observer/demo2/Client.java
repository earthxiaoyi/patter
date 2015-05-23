package cn.com.patter.observer.demo2;

public class Client {
	public static void main(String[] args) {
		WaterQuality w = new WaterQuality();
		
		WatcherObserver w1 = new Watcher();
		w1.setJob("检测人员");
		
		WatcherObserver w2 = new Watcher();
		w2.setJob("预警人员");
		
		WatcherObserver w3 = new Watcher();
		w3.setJob("监测部门领导");
		
		w.attach(w1);
		w.attach(w2);
		w.attach(w3);
		
		System.out.println("水质正常");
		w.setPolluteLevel(0);
		System.out.println("水质轻度污染");
		w.setPolluteLevel(1);
		System.out.println("水质重度污染");
		w.setPolluteLevel(2);
	}
}
