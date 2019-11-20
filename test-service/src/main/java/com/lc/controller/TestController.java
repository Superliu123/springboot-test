/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author liu_chao[liu_chao2@suixingpay.com]
 * @date 2019-11-19 21:13
 * @version 01
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.lc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-11-19 21:13
 */
@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping("hello")
    public Map<String, String> helloworld(){
        Map<String, String> map = new HashMap<>();
        map.put("code","200");
        map.put("msg","HelloWorld");
        return map;
    }

}
