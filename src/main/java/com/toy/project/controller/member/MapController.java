package com.toy.project.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MapController {
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



//    test
}
