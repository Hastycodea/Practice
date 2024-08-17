package com.hastycode.inputForm.controller;

import com.hastycode.inputForm.model.Member;
import com.hastycode.inputForm.services.MemberServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {

    private MemberServices service;

    public MemberController(MemberServices service) {
        this.service = service;
    }

    @GetMapping("/home-view")
    public String home() {
        return "home-view";
    }

    @PostMapping("/submit_form")
    public String addMember(Member member) {
        service.addMember(member);
        String message = member.getName() + " welcome to the team";

        return "welcome-view";
    }
}
