package cn.com.patter.chain.demo1;

public class Client {
	public static void main(String[] args) {
		//构建职责链
		Handler h1 = new GeneralManager();
		Handler h2 = new DepManager();
		Handler h3 = new ProjectManager();
		
		h3.setSuccessor(h2);
		h2.setSuccessor(h1);
		
		String str = h3.handlerFreeRequest("小李", 2012);
		System.out.println(str);
	}
}
