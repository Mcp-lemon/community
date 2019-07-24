package com.mcp.study.community.dto;

import com.mcp.study.community.model.User;
import lombok.Data;

/**
 * @author mcp
 * @date 2019/7/24 - 15:23
 */
@Data
public class QuestionDTO {
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
    private User user;
}
