package cn.com.patter.chain.demo;

public class Client {
	public static void main(String[] args) {
		//先要组装职责连
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler2();
		//先处理完H1 再处理 H2
		h1.setSucessor(h2);
		h1.handlerRequest();
	}
}
