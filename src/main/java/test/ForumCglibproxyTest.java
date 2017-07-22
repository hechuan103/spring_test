package main.java.test;

import main.java.aop.CglibProxy;
import main.java.aop.proto.ForumServiceImpl;

/**
 * Created by:  intelliJ IDEA
 *
 * @Author albert
 * @Description: cglib代理
 * @Date:2017/7/19 下午4:12
 * @package:main.java.test
 * @Modified By:
 */
public class ForumCglibproxyTest {

    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        ForumServiceImpl forumService = (ForumServiceImpl) proxy.getProxy(ForumServiceImpl.class);
        forumService.removeForum(20);
        forumService.removeTopic(1203);
    }

}
