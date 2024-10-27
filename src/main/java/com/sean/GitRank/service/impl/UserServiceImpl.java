package com.sean.GitRank.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.sean.GitRank.mapper.UserMapper;
import com.sean.GitRank.model.dto.User;
import com.sean.GitRank.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author 24395
* @description 针对表【user(用户登录/注册/介绍表)】的数据库操作Service实现
* @createDate 2024-10-27 21:09:34
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




