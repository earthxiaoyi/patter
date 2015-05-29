package cn.com.patter.proxy.simple;

public class RealSubject implements Subject {

	@Override
	public void request() {
		//具体的功能处理
		System.out.println("a");
	}

}
