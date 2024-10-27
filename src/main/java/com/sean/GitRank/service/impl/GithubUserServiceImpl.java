package com.sean.GitRank.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sean.GitRank.mapper.GithubUserMapper;
import com.sean.GitRank.model.dto.GithubUser;

import com.sean.GitRank.service.GithubUserService;
import org.springframework.stereotype.Service;

/**
* @author 24395
* @description 针对表【github_user(Github用户表)】的数据库操作Service实现
* @createDate 2024-10-27 21:03:25
*/
@Service
public class GithubUserServiceImpl extends ServiceImpl<GithubUserMapper, GithubUser>
    implements GithubUserService {

}




