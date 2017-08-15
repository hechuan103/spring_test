package com.spring.test;

import com.spring.aop.proto.ForumService;
import com.spring.aop.proto.ForumServiceImpl;

/**
 * Created by:  intelliJ IDEA
 *
 * @Author albert
 * @Description:
 * @Date:2017/7/19 下午2:33
 * @package:test
 * @Modified By:
 */
public class ForumServiceTest {

    public static void main(String[] args) {
        ForumService forumService = new ForumServiceImpl();

        forumService.removeForum(20);
        forumService.removeTopic(121);

    }
}
