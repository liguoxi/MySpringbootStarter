package com.example.myspringbootstarter.configure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "my.thread.config")
public class MyThreadConfig {
    private Integer maxThread;
    private Integer coreThread;

    public Integer getMaxThread() {
        return maxThread;
    }

    public void setMaxThread(Integer maxThread) {
        this.maxThread = maxThread;
    }

    public Integer getCoreThread() {
        return coreThread;
    }

    public void setCoreThread(Integer coreThread) {
        this.coreThread = coreThread;
    }
}
