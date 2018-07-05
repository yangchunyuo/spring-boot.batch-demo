package com.batch.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.item.ItemWriter;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseWriter <writerClass> implements ItemWriter<writerClass> {

	protected Logger log = LoggerFactory.getLogger(getClass());

	protected StepExecution stepExecution;

	@BeforeStep
	public void saveStepExecution(StepExecution stepExecution) {
		this.stepExecution = stepExecution;
	}
	
	/**
	 * 参数+1
	 * @param key
	 */
	public void addIntStepParameter(String key) {
		// 第一次 0
		if (this.stepExecution.getJobExecution().getExecutionContext().get(key) == null) {
			this.stepExecution.getJobExecution().getExecutionContext().put(key, 0);
		}
		int value = this.stepExecution.getJobExecution().getExecutionContext().getInt(key);
		value = value + 1 ;
		this.stepExecution.getJobExecution().getExecutionContext().put(key, value);
	}
	
	/**
	 * list参数+1
	 * @param key
	 * @param value
	 */
	public void addListStepParameter(String key, Object value) {
		// 第一次 初始化集合
		if (this.stepExecution.getJobExecution().getExecutionContext().get(key) == null) {
			this.stepExecution.getJobExecution().getExecutionContext().put(key, new ArrayList<>());
		}
		List<Object> list= (List<Object>) this.stepExecution.getJobExecution().getExecutionContext().get(key);
		list.add(value);
		this.stepExecution.getJobExecution().getExecutionContext().put(key, list);
	}

	/**
	 * 检查[value]是否已存在列表中
	 * @param key
	 * @param value
	 * @return
	 */
	public Boolean checkValueList (String key, Object value) {
		if (this.stepExecution.getJobExecution().getExecutionContext().get(key) == null) {
			return false;
		}
		return ((List<Object>) this.stepExecution.getJobExecution().getExecutionContext().get(key)).contains(value);
	}
}
