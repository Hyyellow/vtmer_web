package com.vtmer.controller;

import com.vtmer.domain.User;
import com.vtmer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/selectAll")
    public String selectAll(Model model){
        List<User> list = userService.selectAll();
        model.addAttribute("list",list);
        return "success";
    }
}
