package com.mcp.study.community.model;

import lombok.Data;

/**
 * @author mcp
 * @date 2019/7/23 - 16:06
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;


}
