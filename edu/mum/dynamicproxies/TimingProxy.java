package edu.mum.dynamicproxies;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimingProxy implements InvocationHandler {
	
	private Object targetObject;
	
	public TimingProxy(Object obj) {
		targetObject = obj;
	}
	
	public static Object newInstance(Object obj) {
		return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj
		                .getClass().getInterfaces(), new TimingProxy(obj));
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long start = System.nanoTime();
		Object result = method.invoke(targetObject, args);
		long end = System.nanoTime();
		System.out.println("Time Taken : " + (end-start) + "ns");
		return result;            
	}

}
