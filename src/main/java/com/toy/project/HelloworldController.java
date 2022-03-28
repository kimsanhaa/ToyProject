package com.toy.project;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloworldController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("hello", "서버에서 보내준 값입니다");
		return "/hello";
	}


//@GetMapping(value="/temp/insert") 
//public void tempInsert(@RequestParam("tempdata") String tempdata) throws Exception {
//	System.out.println(tempdata);
//	
//	}


 }



