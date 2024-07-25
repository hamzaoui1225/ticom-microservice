package com.billcom.createcustomer.bean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;

@ComponentScan({"com.billcom.createcustomer.configuration"})
@Component
public class AsyncConfig {

		@Bean(name="taskExecutor")
		public Executor taskExecutor () {
			ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
			executor.setCorePoolSize(Integer.parseInt( Extern.getThreadCorePoolSize()));
			executor.setMaxPoolSize(Integer.parseInt(Extern.getThreadMaxPoolSize()));
			executor.setQueueCapacity(Integer.parseInt(Extern.getThreadQueueCapacity()));
			executor.setThreadNamePrefix("threadUser---");
			executor.setWaitForTasksToCompleteOnShutdown(true);
			executor.initialize();
			return executor ;
		}
}
