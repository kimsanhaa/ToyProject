package com.toy.project.temp.test;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController()
@CrossOrigin("*")

public class TempController {
	
	@GetMapping(value="/temp/insert") 
	public void tempInsert(@RequestParam("tempdata") String tempdata) throws Exception {
		System.out.println(tempdata);
		
		}


	
}// end class()
