package com.oasystem.team.serviceImpl;

import com.oasystem.team.entity.Users;
import com.oasystem.team.mapper.UsersMapper;
import com.oasystem.team.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 十一组
 * @since 2020-10-21
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
