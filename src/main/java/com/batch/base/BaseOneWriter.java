package com.batch.base;

import java.util.List;

/**
 * writer 单个记录处理 共同封装
 */
public abstract class BaseOneWriter<writerClass> extends BaseWriter<writerClass> {

    @Override
    public void write(List<? extends writerClass> items) throws Exception {
        for (writerClass item : items) {
            doWriter(item);
        }
    }

    protected abstract void doWriter (writerClass item);
}
