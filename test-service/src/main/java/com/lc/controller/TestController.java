package com.lc.controller;

import com.lc.domain.User;
import com.lc.service.TestService;
import com.lc.utils.ResponseUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @description:
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-11-19 21:13
 */
@RestController
@RequestMapping("test")
@Slf4j
public class TestController {
    @Autowired
    private TestService testService;
    @GetMapping("hello")
    public ResponseUtils helloworld(){
        try {
            User student = testService.getUser("1");
            log.info("test出参student[{}]",student);
            return ResponseUtils.ok(student, "查询成功");
        } catch (Exception e) {
            return ResponseUtils.warn("服务异常，请稍后再试");
        }

    }

}
