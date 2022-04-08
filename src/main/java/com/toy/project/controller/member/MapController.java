package com.toy.project.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//http://localhost:8090/gillBoard
@Controller
public class MapController {


    @GetMapping("/foodMap")
    public String GillBoardService(){
        return "/map/foodMap";
    }






}
