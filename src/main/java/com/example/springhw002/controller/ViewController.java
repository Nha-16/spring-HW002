package com.example.springhw002.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping("/view")
    public String view(){
        return "view";
    }
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
