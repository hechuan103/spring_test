package com.spring.thread;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by hechuan on 2017/8/11.
 */
 @Configuration
 @ComponentScan(basePackages = {"com.spring.thread"})
 @ImportResource(value = { "spring-config.xml" })
 public class MultiThreadConfig {
 }
