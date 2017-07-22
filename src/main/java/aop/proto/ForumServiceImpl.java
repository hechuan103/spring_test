package main.java.aop.proto;

/**
 * Created by:  intelliJ IDEA
 *
 * @Author albert
 * @Description:
 * @Date:2017/7/19 下午2:23
 * @package:main.java.aop
 * @Modified By:
 */
public class ForumServiceImpl implements ForumService {
    @Override
    public void removeTopic(int topicId) {
        //①-1开始对该方法进行性能监视
        PerformanceMonitor.begin(
                "main.java.aop.proto.ForumServiceImpl. removeTopic");
        System.out.println("模拟删除Topic记录:"+topicId);
        try {
            Thread.currentThread().sleep(20);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //①-2结束对该方法进行性能监视
        PerformanceMonitor.end();
    }

    @Override
    public void removeForum(int forumId) {
        //②-1开始对该方法进行性能监视
        PerformanceMonitor.begin(
                "main.java.aop.proto.ForumServiceImpl. removeForum");
        System.out.println("模拟删除Forum记录:"+forumId);
        try {
            Thread.currentThread().sleep(40);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //②-2结束对该方法进行性能监视
        PerformanceMonitor.end();
    }
}

