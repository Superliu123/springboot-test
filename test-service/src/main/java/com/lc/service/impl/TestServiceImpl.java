package com.lc.service.impl;

import com.lc.domain.User;
import com.lc.enums.SystemMessageEnums;
import com.lc.mapper.UserMapper;
import com.lc.service.TestService;
import com.lc.utils.ResponseUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-11-20 11:49
 */
@Service
@Slf4j
public class TestServiceImpl implements TestService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResponseUtils getUser(String uuid){
        log.info("测试test入参uuid[{}]", uuid);
        User user = userMapper.findById(uuid);
        log.info("test出参student[{}]",user);
        if (user == null) {
            return ResponseUtils.ok(new Object(), SystemMessageEnums.DATA_IS_NULL.getMsg());
        } else {
            return ResponseUtils.ok(user);
        }
    }
}
