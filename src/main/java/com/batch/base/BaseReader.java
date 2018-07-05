package com.batch.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.item.database.AbstractPagingItemReader;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页 reader 父类
 * @param <readerClass> reader class
 */
public abstract class  BaseReader<readerClass> extends AbstractPagingItemReader<readerClass> {

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
		int value = this.stepExecution.getJobExecution().getExecutionContext().getInt(key);
		value = value + 1 ;
		this.stepExecution.getJobExecution().getExecutionContext().put(key, value);
	}

	/**
	 * 字符型 参数 赋值
	 * @param key
	 * @param log
	 */
	public void addLogStepParameter (String key, String log) {
		if (this.stepExecution.getJobExecution().getExecutionContext().get(key) != null) {
			log += "," + this.stepExecution.getJobExecution().getExecutionContext().getString(key);
		}
		this.stepExecution.getJobExecution().getExecutionContext().put(key, log);
	}
	
	/**
	 * list参数+1
	 * @param key
	 * @param value
	 */
	public void addListStepParameter(String key, Object value) {
		@SuppressWarnings("unchecked")
		List<Object> list= (List<Object>) this.stepExecution.getJobExecution().getExecutionContext().get(key);
		if (!list.contains(value)) {
			list.add(value);
		}
		this.stepExecution.getJobExecution().getExecutionContext().put(key, list);
	}

	@Override
	protected void doOpen() throws Exception {
		super.doOpen();
		if (this.stepExecution.getJobExecution().getExecutionContext().get(CodeConstantBatch.ITEM_COUNT) == null)
			stepExecution.getJobExecution().getExecutionContext().put(CodeConstantBatch.ITEM_COUNT, 0);
		if (this.stepExecution.getJobExecution().getExecutionContext().get(CodeConstantBatch.ITEM_SUCCESS_COUNT) == null)
			stepExecution.getJobExecution().getExecutionContext().put(CodeConstantBatch.ITEM_SUCCESS_COUNT, 0);
		if (this.stepExecution.getJobExecution().getExecutionContext().get(CodeConstantBatch.ITEM_FAIL_COUNT) == null)
			stepExecution.getJobExecution().getExecutionContext().put(CodeConstantBatch.ITEM_FAIL_COUNT, 0);
		if (this.stepExecution.getJobExecution().getExecutionContext().get(CodeConstantBatch.ITEM_FAIL_LIST) == null)
			stepExecution.getJobExecution().getExecutionContext().put(CodeConstantBatch.ITEM_FAIL_LIST, new ArrayList<>());
	}

	@Override
	protected void doJumpToPage(int itemIndex) {
		logger.debug("doJumpToPage，itemIndex=" + itemIndex);
	}
	
	
}
