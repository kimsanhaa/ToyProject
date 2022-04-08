package com.toy.project.controller.member;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//http://localhost:8090/main

@Controller
public class MemberController {

    @GetMapping("/main")
    public String MainMember(){
        return "member/main";
    }
}
