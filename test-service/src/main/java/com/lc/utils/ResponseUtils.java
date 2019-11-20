/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author liu_chao[liu_chao2@suixingpay.com]
 * @date 2019-11-19 21:14
 * @version 01
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.lc.utils;

import lombok.Data;

/**
 * @description:
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-11-19 21:14
 */
@Data
public class ResponseUtils<T> {

    private static final String SUCCESS = "200";

    private static final String FAIL = "500";

    private String code;

    private String msg;

    private T Data;

    public ResponseUtils(){}
}
