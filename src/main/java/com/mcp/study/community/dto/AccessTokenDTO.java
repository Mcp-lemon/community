package com.mcp.study.community.dto;

import lombok.Data;

/**
 * @author mcp
 * @date 2019/7/23 - 10:39
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
