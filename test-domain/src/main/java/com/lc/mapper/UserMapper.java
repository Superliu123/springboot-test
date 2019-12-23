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
