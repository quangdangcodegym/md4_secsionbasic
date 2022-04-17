package com.codegym.controller;

import com.codegym.model.MyCounter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes("mycounter")
public class CounterController {

    /* add MyCounter in model attribute */
    @ModelAttribute("mycounter")
    public MyCounter setUpCounter() {
        System.out.println("setUpCounter");
        return new MyCounter();
    }

    @GetMapping("/")
    public String get(@ModelAttribute("mycounter") MyCounter myCounter) {
        myCounter.increment();
        System.out.println("get");
        return "index";
    }
}