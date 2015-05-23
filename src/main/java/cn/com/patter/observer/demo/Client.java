package cn.com.patter.observer.demo;

public class Client {

	public static void main(String[] args) {
		//创建报纸，作为被观察者
		NewsPaper subject = new NewsPaper();
		//创建阅读者，也就是观察者
		Reader reader1 = new Reader();
		reader1.setName("张三");
		Reader reader2 = new Reader();
		reader2.setName("李四");
		Reader reader3 = new Reader();
		reader3.setName("王五");
		Reader reader4 = new Reader();
		reader4.setName("宫二");
		
		//注册阅读者
		subject.attach(reader2);
		subject.attach(reader1);
		subject.attach(reader3);
		subject.attach(reader4);
		
		subject.setContent("这次的报纸是观察者模式！");
		
		
	}

}
