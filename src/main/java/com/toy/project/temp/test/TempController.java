package com.toy.project.temp.test;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()




public class TempController {
	
	@Autowired
	private TempService tempService;
	
	@Autowired 
	private TempVO tempVO;
	
	@GetMapping(value="/temp/insert") 
	public void tempInsert(@RequestParam("tempdata") String tempdata) throws Exception {
		
		System.out.println(tempdata);
			tempService.test(tempdata);
		
		}

	@GetMapping("/hello-api")
	@ResponseBody
	public Hello helloapi(@RequestParam("name") String name) {
		Hello hello = new Hello();

		hello.setName(name);
		return hello;
	}

	static class Hello{
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

  
	
}// end class()
