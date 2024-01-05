package com.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 实现InvocationHandler接口的代理类DynamicProxy
public class DynamicProxy implements InvocationHandler {
    private Object obj; // 目标对象

    public DynamicProxy(Object obj) {
        System.out.println(obj);
        this.obj = obj;
    }

    // 代理类调用目标方法时，invoke方法会被调用
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println(proxy);
        System.out.println("before request"); // 在目标方法执行前进行操作，如打印日志、权限验证等
        Object result = method.invoke(obj, args); // 调用目标方法
        System.out.println("after request"); // 在目标方法执行后进行操作，如打印日志、处理返回值等
        return result; // 返回目标方法的返回值
    }

    // 动态代理机制的使用示例
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject(); // 创建目标对象
        DynamicProxy dynamicProxy = new DynamicProxy(realSubject); // 创建代理对象
        Subject subject = (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(), dynamicProxy); // 创建动态代理对象
        subject.request(); // 调用代理对象的方法
    }
}
