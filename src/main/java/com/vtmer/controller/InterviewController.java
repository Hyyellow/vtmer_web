package com.vtmer.controller;

import com.vtmer.domain.Interview;
import com.vtmer.domain.User;
import com.vtmer.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/interview")
public class InterviewController {
    @Autowired
    private InterviewService interviewService;

    @RequestMapping("/selectInterviewById")
    public String selectInterviewById(Model model,Integer id){
        List<Interview> list = interviewService.selectInterviewById(id);
        model.addAttribute("interviewList",list);
        return "success";
    }
}
