package com.batch.base;

import com.github.pagehelper.PageHelper;

import java.util.List;

/**
 * 共同 分页 reader 封装
 */
public abstract class BasePageReader<readerClass> extends BaseReader<readerClass> {

    @Override
    protected void doReadPage() {
        // 配置分页参数
        PageHelper.startPage(getPage() + 1, getPageSize(), false);
        // 执行查询 返回数据
        results = doReadList();
    }

    protected abstract List<readerClass> doReadList ();
}
