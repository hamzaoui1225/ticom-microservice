package com.billcom.changecontractstatus.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;

@Component
@ComponentScan({"com.billcom.changecontractstatus.configuration"})
public class AsyncConfig {

	@Value("${thread.corepoolsize}")
	String getThreadCorePoolSize;
	@Value("${thread.maxpoolsize}")
	String getThreadMaxPoolSize;
	@Value("${thread.queuecapacity}")
	String getThreadQueueCapacity;

	@Bean(name="taskExecutor")
	public Executor taskExecutor () {
		ThreadPoolTaskExecutor executor =new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(Integer.parseInt(getThreadCorePoolSize));
		executor.setMaxPoolSize(Integer.parseInt(getThreadMaxPoolSize));
		executor.setQueueCapacity(Integer.parseInt(getThreadQueueCapacity));
		executor.setThreadNamePrefix("threadUser---");
		executor.setWaitForTasksToCompleteOnShutdown(true);
		executor.initialize();
		return executor ;
	}
}
