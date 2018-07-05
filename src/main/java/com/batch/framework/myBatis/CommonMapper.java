package com.batch.framework.myBatis;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.RowBoundsMapper;

/**
 * common mapper
 */
public interface CommonMapper<T> extends BaseMapper<T>,RowBoundsMapper<T>, ConditionMapper<T>, MySqlMapper<T> {

}
