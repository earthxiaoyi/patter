package cn.com.patter.proxy.simple;

public class Proxy implements Subject {

	private RealSubject realSubject = null;
	
	@Override
	public void request() {
		
		//在调用目标对象前,可以做一些功能处理
		System.out.println("调用方法前");
		
		realSubject.request();
		
		//在调用目标对象后,可以做一些功能处理
		System.out.println("调用方法后");
	}
	
	public Proxy(RealSubject realSubject){
		this.realSubject = realSubject;
	}

}
