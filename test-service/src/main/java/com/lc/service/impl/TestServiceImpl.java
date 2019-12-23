/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author liu_chao[liu_chao2@suixingpay.com]
 * @date 2019-11-20 11:49
 * @version 01
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.lc.service.impl;

import com.lc.domain.User;
import com.lc.mapper.UserMapper;
import com.lc.service.TestService;
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

    public User getUser(String uuid){
        log.info("测试test入参uuid[{}]", uuid);
        return userMapper.findById(uuid);
    }
}
