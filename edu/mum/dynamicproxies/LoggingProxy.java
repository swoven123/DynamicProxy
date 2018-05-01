package edu.mum.dynamicproxies;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingProxy implements InvocationHandler{
	
	private Object targetObject;
	
	public LoggingProxy(Object obj) {
		targetObject = obj;
	}
	
	public static Object newInstance(Object obj) {
		return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj
		                .getClass().getInterfaces(), new LoggingProxy(obj));
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Using Logger Proxy Class, some logs goes here");
		Object result = method.invoke(targetObject, args);
		return result;
	}
	
}
