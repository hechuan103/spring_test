package main.java.aop;

import main.java.aop.proto.PerformanceMonitor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by:  intelliJ IDEA
 *
 * @Author albert
 * @Description:
 * @Date:2017/7/19 下午2:49
 * @package:main.java.aop
 * @Modified By:
 */
public class PerformanceHandler implements InvocationHandler {

    private Object target;
    public PerformanceHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        PerformanceMonitor.begin(target.getClass().getName()+"."+method.getName());
        Object obj = method.invoke(target,args);
        PerformanceMonitor.end();
        return obj;
    }
}
