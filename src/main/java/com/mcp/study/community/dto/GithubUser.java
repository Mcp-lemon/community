package com.mcp.study.community.dto;

import lombok.Data;

/**
 * @author mcp
 * @date 2019/7/23 - 14:04
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;
}
