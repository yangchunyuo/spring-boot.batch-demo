package com.batch.base;

public interface CodeConstantBatch {
	
	/** 总记录数 */
	String ITEM_COUNT = "item.count";
	/** 成功记录数 */
	String ITEM_SUCCESS_COUNT = "item.success.count";
	/** 失败记录数 */
	String ITEM_FAIL_COUNT = "item.fail.count";
	/** 失败记录集合 */
	String ITEM_FAIL_LIST = "item.fail.list";

	/** 账单 */
	interface BILL {
		/** 账单 丢失 数量 */
		String MISSING_COUNT = "bill.missing.count";
		/** 账单 丢失 列表 */
		String MISSING_LIST = "bill.missing.list";
		/** 账单 不同步 数量 */
		String ASYNCHRONY_COUNT = "bill.asynchrony.count";
		/** 账单 不同步 列表 */
		String ASYNCHRONY_LIST = "bill.asynchrony.list";
	}

	/** 清除数据日志 */
	String CLEAN_LOG = "clean.log";
	
}
