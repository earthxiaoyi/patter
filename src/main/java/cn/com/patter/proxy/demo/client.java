package cn.com.patter.proxy.demo;

public class client {
	public static void main(String[] args) {
		Order order = new Order("设计模式",100,"张三");
		DynamicProxy dynamicProxy = new DynamicProxy();
		OrderApi orderApi = dynamicProxy.getProxyInterface(order);
		orderApi.setOrderNum(50, "李四");
	}
}
