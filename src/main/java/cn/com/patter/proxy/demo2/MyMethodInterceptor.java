package cn.com.patter.proxy.demo2;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyMethodInterceptor implements MethodInterceptor {

	@Override
	public Object intercept(Object obj, Method method, Object[] arg,
			MethodProxy proxy) throws Throwable {
		
		System.out.println("执行方法前");
		
		Object invokeSuper = proxy.invokeSuper(obj, arg);
		
		System.out.println("执行方法后");
		
		return invokeSuper;
	}

}
