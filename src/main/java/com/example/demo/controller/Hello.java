package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello {

    @GetMapping("/hello")
    public String hello(@RequestParam(name="name",required = false,defaultValue = "默认王老五") String name ,Model model) {
        model.addAttribute("name", name);
        System.out.println("in hello controller");
        System.out.println();
        return "hellopage";
    }
}
