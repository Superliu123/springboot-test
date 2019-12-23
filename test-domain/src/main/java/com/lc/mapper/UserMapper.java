/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author liu_chao[zhou_chen2@suixingpay.com]
 * @date 2019-11-06 18:47
 * @version 01
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.lc.mapper;

import com.lc.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @description: UserMapper
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-11-06 18:47
 */
@Mapper
public interface UserMapper {

    User findById(@Param("uuid") String uuid);

}
