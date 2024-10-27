package com.sean.GitRank.model.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Github用户表
 * @TableName github_user
 */
@TableName(value ="github_user")
@Data
public class GithubUser implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    private String login;

    /**
     * 
     */
    private String node_id;

    /**
     * 头像链接
     */
    private String avatar_url;

    /**
     * 
     */
    private String gravatar_id;

    /**
     * 用户信息请求地址
     */
    private String url;

    /**
     * 用户主页链接
     */
    private String html_url;

    /**
     * 粉丝信息请求地址
     */
    private String followers_url;

    /**
     * 关注者信息请求地址
     */
    private String following_url;

    /**
     * 
     */
    private String gists_url;

    /**
     * 收藏某人项目的请求地址
     */
    private String starred_url;

    /**
     * 订阅请求地址
     */
    private String subscriptions_url;

    /**
     * 组织请求地址
     */
    private String organizations_url;

    /**
     * 个人项目请求地址
     */
    private String repos_url;

    /**
     * 事件请求地址
     */
    private String events_url;

    /**
     * 接受的事件请求地址
     */
    private String received_events_url;

    /**
     * 类型 
     */
    private String type;

    /**
     * 用户访问类型
     */
    private String user_view_type;

    /**
     * 站点管理员（0 - 否 1 - 是）
     */
    private Integer site_admin;

    /**
     * 昵称
     */
    private String name;

    /**
     * 公司
     */
    private String company;

    /**
     * 博客
     */
    private String blog;

    /**
     * 地区
     */
    private String location;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 
     */
    private String hireable;

    /**
     * 
     */
    private String bio;

    /**
     * 推特昵称
     */
    private String twitter_username;

    /**
     * 公共仓库数量
     */
    private Integer public_repos;

    /**
     * 
     */
    private Integer public_gists;

    /**
     * 粉丝数量
     */
    private Integer followers;

    /**
     * 关注者数量
     */
    private Integer following;

    /**
     * 创建时间
     */
    private Date created_at;

    /**
     * 更新时间
     */
    private Date updated_at;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}