package com.batch.config;

import com.batch.job.batch001.UserReader;
import com.batch.job.batch001.UserWriter;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * batch 001 job configuration
 */
@Configuration
public class BatchJobConfig_001 {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    ItemReader userReader() { return new UserReader(); }
    @Bean
    ItemWriter userWriter() { return new UserWriter(); }

    @Bean
    Step step_001 () {
        return stepBuilderFactory.get("step_001")
                .chunk(100)
                .reader(userReader())
                .writer(userWriter())
                .build();
    }

    @Bean
    Job job_001 () {
        return jobBuilderFactory.get("job001")
                .incrementer(new RunIdIncrementer())
                .start(step_001())
                .build();
    }

}
