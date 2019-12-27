package com.lc.controller;

import com.lc.domain.User;
import com.lc.service.TestService;
import com.lc.utils.ResponseUtils;
import com.lc.enums.SystemMessageEnums;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @description:
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-11-19 21:13
 */
@RestController
@RequestMapping("test")
@Slf4j
@Api(value = "测试接口")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("hello")
    @ApiOperation(value = "测试hello", notes = "测试hello")
    public ResponseUtils helloWorld(@RequestParam("uuid") String uuid){
        try {
            return testService.getUser(uuid);
        } catch (Exception e) {
            log.warn("查询异常", e.getMessage());
            return ResponseUtils.warn(SystemMessageEnums.SYSTEM_ERROR);
        }
    }

}
