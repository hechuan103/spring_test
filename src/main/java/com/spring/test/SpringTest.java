package com.spring.test;

import com.spring.entity.HelloWord;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by:  intelliJ IDEA
 *
 * @Author albert
 * @Description:
 * @Date:2017/7/18 下午6:05
 * @package:test
 * @Modified By:
 */
public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        HelloWord helloWord = (HelloWord) applicationContext.getBean("helloWorld");

        System.out.println(helloWord.toString());

    }
}
