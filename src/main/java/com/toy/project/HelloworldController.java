package com.toy.project;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin("*")


public class HelloworldController {
@RequestMapping("/home")
public String home() {
	System.out.println("react접속");
	return "안녕하새우 ?? ";
}

//@GetMapping(value="/temp/insert") 
//public void tempInsert(@RequestParam("tempdata") String tempdata) throws Exception {
//	System.out.println(tempdata);
//	
//	}


 }



