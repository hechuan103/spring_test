package main.java.thread;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by hechuan on 2017/8/11.
 */
@Configuration
 @ComponentScan(basePackages = { "main.java.thread" })
 @ImportResource(value = { "classpath*:resources/spring-config.xml" })
 @EnableScheduling
 public class MultiThreadConfig {
 }
