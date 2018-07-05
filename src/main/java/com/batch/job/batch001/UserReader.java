package com.batch.job.batch001;

import com.batch.base.BaseOneReader;
import com.batch.entities.live.UserInfo;
import com.batch.mapper.user.UserInfoMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * user reader
 */
public class UserReader extends BaseOneReader<UserInfo> {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    protected List<UserInfo> doOneReader() {
        PageHelper.startPage(1, 25, false);
        return userInfoMapper.selectAll();
    }
}
