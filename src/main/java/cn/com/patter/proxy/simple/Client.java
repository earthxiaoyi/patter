package cn.com.patter.proxy.simple;

public class Client {
	
	public static void main(String[] args) {
		RealSubject subject = new RealSubject();
		Proxy proxy = new Proxy(subject);
		
		proxy.request();
		
	}
	
}
