package com.oasystem.team.mapper;

import com.oasystem.team.entity.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 十一组
 * @since 2020-10-21
 */
public interface UsersMapper extends BaseMapper<Users> {

    /**
     *  方法用途说明
     * @param users
     * @return
     */
    Users loginUser(Users users);
}
