package main.java.task;

import main.java.entity.HelloWord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by:  intelliJ IDEA
 *
 * @Author albert
 * @Description:
 * @Date:2017/7/21 下午2:27
 * @package:main.java.task
 * @Modified By:
 */
@Component
public class TaskTime {
    @Autowired
    HelloWord helloWord;
    private static int count;
    @Scheduled(cron = "0/3 * * * * ?")
    public void taskStart(){
        count++;
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("第"+count+"次，时间"+sdf.format(date));
        System.out.println(helloWord.getCompany());
    }
}
