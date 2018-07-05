package com.batch.base;

import java.util.ArrayList;
import java.util.List;

/**
 * 单次查询 reader 共同封装
 */
public abstract class BaseOneReader<readerClass> extends BaseReader<readerClass> {

    @Override
    protected void doReadPage() {
        List<readerClass> list = new ArrayList<>();
        // 只有第一页时查询，第二页以后就直接返回空集合
        if (getPage() == 0) {
            list = doOneReader();
            setPageSize(list.size());
        }
        results = list;
    }

    protected abstract List<readerClass> doOneReader ();
}
