package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by r.jain
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
