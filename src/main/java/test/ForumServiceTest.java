package main.java.test;

import main.java.aop.proto.ForumService;
import main.java.aop.proto.ForumServiceImpl;

/**
 * Created by:  intelliJ IDEA
 *
 * @Author albert
 * @Description:
 * @Date:2017/7/19 下午2:33
 * @package:main.java.test
 * @Modified By:
 */
public class ForumServiceTest {

    public static void main(String[] args) {
        ForumService forumService = new ForumServiceImpl();

        forumService.removeForum(20);
        forumService.removeTopic(121);

    }
}
