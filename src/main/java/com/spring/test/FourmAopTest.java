package com.spring.test;

import com.spring.aop.ForumAop;
import com.spring.aop.PerformanceHandler;
import com.spring.aop.proto.ForumService;

import java.lang.reflect.Proxy;

/**
 * Created by:  intelliJ IDEA
 *
 * @Author albert
 * @Description:
 * @Date:2017/7/19 下午2:57
 * @package:test
 * @Modified By:
 */
public class FourmAopTest {
    public static void main(String[] args) {
        ForumService target = new ForumAop();

        //将目标业务类和横切代码编织到一起jdk代理
        PerformanceHandler handler = new PerformanceHandler(target);
        //根据编织了目标业务类逻辑和性能监视横切逻辑的InvocationHandler实例创建代理实例
        ForumService proxy = (ForumService) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),handler);
        proxy.removeForum(20);
        proxy.removeTopic(10);

    }
}
