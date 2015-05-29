package cn.com.patter.proxy.demo2;

import net.sf.cglib.proxy.Enhancer;

public class ProxyFactory {
	
	
	public static Object getProxyObj(String clazz) throws Exception{
		Class<?> obj = Class.forName(clazz);
		Enhancer hancer = new Enhancer();
		//设置代理对象父类
		hancer.setSuperclass(obj);
		//设置回调对象,即调用代理对象里面的方法时,实际上执行的是回调对象(即intercept 方法)
		hancer.setCallback(new MyMethodInterceptor());
		//创建代理对象
		return hancer.create();
	}
}
