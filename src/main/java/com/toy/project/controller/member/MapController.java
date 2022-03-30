package com.toy.project.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


//http://localhost:8090/gillBoard
@Controller
public class MapController {


    @GetMapping("/gillBoard")
    public String GillBoardService(){
        return "/board/gillBoard";
    }





//    test
}
