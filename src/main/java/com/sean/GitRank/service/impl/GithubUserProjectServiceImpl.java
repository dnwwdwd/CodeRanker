package com.sean.GitRank.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
;
import com.sean.GitRank.mapper.GithubUserProjectMapper;
import com.sean.GitRank.model.dto.GithubUserProject;
import org.springframework.stereotype.Service;

/**
* @author 24395
* @description 针对表【github_user_project(Github用户项目表)】的数据库操作Service实现
* @createDate 2024-10-27 21:16:08
*/
@Service
public class GithubUserProjectServiceImpl extends ServiceImpl<GithubUserProjectMapper, GithubUserProject>
    implements IService<GithubUserProject> {

}




