package com.mcp.study.community.controller;

import com.mcp.study.community.dto.PaginationDTO;
import com.mcp.study.community.dto.QuestionDTO;
import com.mcp.study.community.mapper.UserMapper;
import com.mcp.study.community.model.User;
import com.mcp.study.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author mcp
 * @date 2019/7/22 - 22:57
 */
@Controller
public class IndexController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
        public String index(HttpServletRequest request,
                            Model model,
                            @RequestParam(name = "page",defaultValue = "1") Integer page,
                            @RequestParam(name = "size",defaultValue = "2") Integer size
                            ){
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length != 0)
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("token")){
                String token = cookie.getValue();
                User user = userMapper.findByToken(token);
                if (user !=null){
                    request.getSession().setAttribute("user",user);
                }
                break;
            }
        }

        PaginationDTO pagination= questionService.list(page,size);

            model.addAttribute("pagination",pagination);

        return "index";
    }
}
