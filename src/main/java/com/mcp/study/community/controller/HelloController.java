package com.mcp.study.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author mcp
 * @date 2019/7/22 - 22:57
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
        public String hello(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }


}
