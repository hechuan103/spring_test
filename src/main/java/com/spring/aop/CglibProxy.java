package com.spring.aop;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by:  intelliJ IDEA
 *
 * @Author albert
 * @Description:cglib代理
 * @Date:2017/7/19 下午3:21
 * @package:aop
 * @Modified By:
 */
public class CglibProxy implements MethodInterceptor{

    private Enhancer enhancer = new Enhancer();
    public Object getProxy(Class clazz) {
        enhancer.setSuperclass(clazz); //① 设置需要创建子类的类
        enhancer.setCallback(this);
        return enhancer.create(); //②通过字节码技术动态创建子类实例

    }

    public Object intercept(Object obj, Method method, Object[] args,
                            MethodProxy proxy) throws Throwable {
       // PerformanceMonitor.begin(obj.getClass().getName()+"."+method. getName());//③-1
        Object result=proxy.invokeSuper(obj, args);// ③-2
     //   PerformanceMonitor.end();//③-1通过代理类调用父类中的方法
        return result;
    }

}
