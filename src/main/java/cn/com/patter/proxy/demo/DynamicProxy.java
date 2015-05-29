package cn.com.patter.proxy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * 代理模式
 * java中的动态代理
 * 
 * @author JM
 */

public class DynamicProxy implements InvocationHandler {
	/**
	 * 被代理的对象
	 */
	private OrderApi order = null;
	
	/**
	 * 获取绑定好代理和具体目标对象后的目标对象的接口
	 * @param order	具体目标对象
	 * @return	绑定好代理和具体目标对象后的目标对象的接口
	 */
	public OrderApi getProxyInterface(Order order){
		//设置被代理的对象
		this.order=order;
		//把真正的订单对象和动态代理对象关联起来
		OrderApi  orderApi= (OrderApi)Proxy.newProxyInstance(order.getClass().getClassLoader(), order.getClass().getInterfaces(), this);
		return orderApi;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//调用setter方法就需要检查权限
		if(method.getName().startsWith("set")){
			//如果不是创建人,那就不能修改
			if(order.getOrderUser()!=null && order.getOrderUser().equals(args[1])){
				return method.invoke(order, args);
			}else{
				System.out.println(args[1]+",无权操作订单");
			}
		}else{
			return method.invoke(order, args);
		}
		return null;
	}

}
