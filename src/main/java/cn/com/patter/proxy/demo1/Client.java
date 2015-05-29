package cn.com.patter.proxy.demo1;

public class Client {
	public static void main(String[] args) {
		OrderApi order = new OrderProxy(new Order("java编程思想",4,"张三"));
		
		order.setOrderNum(5, "李四");
		order.setProductName("设计模式", "王二");
		order.setOrderUser("麻子", "麻子");
		
		
		System.out.println(order.toString());
		System.out.println("=======张三修改");
		order.setProductName("设计模式", "张三");
		
		System.out.println(order.toString());
	}
}
