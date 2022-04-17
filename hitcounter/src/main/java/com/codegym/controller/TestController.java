package com.codegym.controller;

import com.codegym.model.MyCounter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

@Controller
public class TestController {
    @GetMapping("/hello")
    public String hello( @SessionAttribute("mycounter") MyCounter myCounter) {
        myCounter.increment();
        System.out.println(myCounter.getCount());
        return "index";
    }
}
