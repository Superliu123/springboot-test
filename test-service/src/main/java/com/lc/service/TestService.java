package com.lc.service;

import com.lc.domain.User;

/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author liu_chao[liu_chao2@suixingpay.com]
 * @version 01
 * @date ${data}
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
public interface TestService {

    User getUser(String uuid);
}
