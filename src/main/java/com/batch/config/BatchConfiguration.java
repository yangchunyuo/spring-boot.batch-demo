package com.batch.config;

import org.springframework.batch.core.configuration.annotation.DefaultBatchConfigurer;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.MapJobRepositoryFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * batch configuration
 */
@Configuration
@EnableBatchProcessing
@MapperScan(basePackages = {"com.batch.mapper.*"})
public class BatchConfiguration extends DefaultBatchConfigurer {

    @Autowired
    private PlatformTransactionManager transactionManager;

    @Override
    protected JobRepository createJobRepository() throws Exception {
        return new MapJobRepositoryFactoryBean(transactionManager).getObject();
    }

}
