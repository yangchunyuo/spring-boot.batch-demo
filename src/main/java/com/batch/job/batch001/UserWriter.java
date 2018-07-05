package com.batch.job.batch001;

import com.batch.base.BaseOneWriter;
import com.batch.entities.live.UserInfo;

/**
 * user writer
 */
public class UserWriter extends BaseOneWriter<UserInfo> {

    @Override
    protected void doWriter(UserInfo item) {
        log.info("用户ID：{},用户昵称：{}", item.getId(), item.getNickName());
    }
}
