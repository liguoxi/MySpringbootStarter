package com.example.myspringbootstarter.configure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ConditionalOnClass(MyThreadConfig.class)
@EnableConfigurationProperties(MyThreadConfig.class)
@Configurable
public class MyThreadPool {
    @Autowired
    MyThreadConfig myThreadConfig;
    @Bean
    public ThreadPoolExecutor MyThreadPoolExecutor() {

        return new ThreadPoolExecutor(myThreadConfig.getCoreThread(), myThreadConfig.getMaxThread(), 100, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1000));
    }
}
