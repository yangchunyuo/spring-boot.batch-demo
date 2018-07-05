package com.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Date;

/**
 * batch run
 */
@SpringBootApplication
public class Run {

    public static void main (String[] args) throws Exception {
        // 加载 spring 上下文
        ApplicationContext context = SpringApplication.run(Run.class);
        // 获取 job launcher
        JobLauncher jobLauncher = context.getBean(JobLauncher.class);
        // 构造 job 运行参数
        JobParameters jobParameters = new JobParametersBuilder().addDate("data", new Date()).toJobParameters();
        // 执行 job
        jobLauncher.run(((Job) context.getBean("job_" + args[0])), jobParameters);
        // 关闭程序
        System.exit(0);
    }

}
