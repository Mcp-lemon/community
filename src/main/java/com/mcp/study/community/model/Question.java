package com.mcp.study.community.model;

import lombok.Data;

/**
 * @author mcp
 * @date 2019/7/24 - 8:32
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
}
