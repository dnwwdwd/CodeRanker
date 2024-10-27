package com.sean.GitRank.model.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Github用户项目表
 * @TableName github_user_project
 */
@TableName(value ="github_user_project")
@Data
public class GithubUserProject implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 
     */
    private String node_id;

    /**
     * 项目名
     */
    private String name;

    /**
     * 全称
     */
    private String full_name;

    /**
     * 是否是私人的（0 - 否 1 - 是）
     */
    private Integer privated;

    /**
     * 拥有人id
     */
    private Long github_user_id;

    /**
     * 项目链接
     */
    private String html_url;

    /**
     * 项目描述/介绍
     */
    private String description;

    /**
     * 是否复刻（0 - 否 1 - 是）
     */
    private Integer fork;

    /**
     * 项目请求地址
     */
    private String url;

    /**
     * 复刻请求地址
     */
    private String forks_url;

    /**
     * key请求地址
     */
    private Integer keys_url;

    /**
     * 协作者请求地址
     */
    private String collaborators_url;

    /**
     * 队伍请求地址
     */
    private String teams_url;

    /**
     * hooks请求地址
     */
    private String hooks_url;

    /**
     * 问题事件请求地址
     */
    private String issue_events_url;

    /**
     * 事件请求地址
     */
    private String events_url;

    /**
     * 分支请求地址
     */
    private String branches_url;

    /**
     * 标签请求地址
     */
    private String tags_url;

    /**
     * git二进制请求地址
     */
    private String blobs_url;

    /**
     * git标签请求地址
     */
    private String git_tags_url;

    /**
     * 
     */
    private String git_refs_url;

    /**
     * 
     */
    private String trees_url;

    /**
     * 状态请求地址
     */
    private String statuses_url;

    /**
     * 语言请求地址
     */
    private String languages_url;

    /**
     * 
     */
    private String stargazers_url;

    /**
     * 贡献者请求地址
     */
    private String contributors_url;

    /**
     * 订阅者请求地址
     */
    private String subscribers_url;

    /**
     * 订阅请求地址
     */
    private String subscription_url;

    /**
     * 提交请求地址
     */
    private String commits_url;

    /**
     * git请求地址
     */
    private String git_commits_url;

    /**
     * 评论请求地址
     */
    private String comments_url;

    /**
     * 问题评论请求地址
     */
    private String issue_comment_url;

    /**
     * 内容请求地址
     */
    private String contents_url;

    /**
     * 比较请求地址
     */
    private String compare_url;

    /**
     * 合并请求地址
     */
    private String merges_url;

    /**
     * 归档请求地址
     */
    private String archive_url;

    /**
     * 下载请求地址
     */
    private String downloads_url;

    /**
     * 问题请求地址
     */
    private String issues_url;

    /**
     * 拉请求请求地址
     */
    private String pulls_url;

    /**
     * 里程碑请求地址
     */
    private String milestones_url;

    /**
     * 通知请求地址
     */
    private String notifications_url;

    /**
     * 标签请求地址
     */
    private String labels_url;

    /**
     * 发布请求地址
     */
    private String releases_url;

    /**
     * 部署请求地址
     */
    private String deployments_url;

    /**
     * 创建时间
     */
    private Date created_at;

    /**
     * 更新时间
     */
    private Date updated_at;

    /**
     * 最后push时间
     */
    private Date pushed_at;

    /**
     * git链接
     */
    private String git_url;

    /**
     * ssh链接
     */
    private String ssh_url;

    /**
     * 克隆链接
     */
    private String clone_url;

    /**
     * svn链接
     */
    private String svn_url;

    /**
     * 主页
     */
    private String homepage;

    /**
     * 大小
     */
    private Integer size;

    /**
     * 
     */
    private Integer stargazers_count;

    /**
     * 访问者数量
     */
    private Integer watchers_count;

    /**
     * 语言
     */
    private String language;

    /**
     * 是否有问题（0 - 无 1 - 有）
     */
    private Integer has_issues;

    /**
     * 是否有项目（0 - 无 1 - 有）
     */
    private Integer has_projects;

    /**
     * 是否有下载（0 - 无 1 - 有）
     */
    private Integer has_downloads;

    /**
     * 是否有wiki（0 - 无 1 - 有）
     */
    private Integer has_wiki;

    /**
     * 是否有pages（0 - 无 1 - 有）
     */
    private Integer has_pages;

    /**
     * 是否有讨论（0 - 无 1 - 有）
     */
    private Integer has_discussions;

    /**
     * 复刻数量
     */
    private Integer forks_count;

    /**
     * 镜像链接
     */
    private Integer mirror_url;

    /**
     * 是否归档（0  - 否 1 - 是）
     */
    private Integer archived;

    /**
     * 是否可用（0  - 否 1 - 是）
     */
    private Integer disabled;

    /**
     * 
     */
    private Integer open_issues_count;

    /**
     * 
     */
    private String license;

    /**
     * 是否允许复刻（0  - 否 1 - 是）
     */
    private Integer allow_forking;

    /**
     * 是否是模板（0  - 否 1 - 是）
     */
    private Integer is_template;

    /**
     * web提交要求说明（0  - 否 1 - 是）
     */
    private Integer web_commit_signoff_required;

    /**
     * 话题（Json 数组）
     */
    private String topics;

    /**
     * 可见性
     */
    private String visibility;

    /**
     * 复刻数量
     */
    private Integer forks;

    /**
     * 
     */
    private Integer open_issues;

    /**
     * 访问人数
     */
    private Integer watchers;

    /**
     * 默认分支
     */
    private String default_branch;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}