package cn.com.patter.proxy.demo2;

public class client {
	
	public static void main(String[] args) throws Exception {
		Order order = new Order("java编程思想",222,"光头强");
		System.out.println(order.toString());
		Order o = (Order)ProxyFactory.getProxyObj(Order.class.getName());
		o.setOrderNum(5, "孜然麻辣熊");
		System.out.println(o.toString());
	}
	
}
