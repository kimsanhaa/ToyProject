package com.toy.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class HomeController {

    @Controller
    public class home {
        @RequestMapping(value = "/", method = RequestMethod.GET)
        public String login(Model model) {
            model.addAttribute("hello", "서버에서 보내준 값입니다");
            return "/login/login";
        }
    }
}
