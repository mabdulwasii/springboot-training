package com.training.springboot.controller;

import com.training.springboot.model.Visitor;
import org.springframework.cglib.core.internal.LoadingCache;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.beans.Visibility;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/home")
public class HomeController {

    private int visitorCount = 0;

    @GetMapping("/hey")
    public String getHey(Model model) {
        System.out.println("Hey visitor " + ++visitorCount );
        Visitor visitor = new Visitor(visitorCount);
        model.addAttribute("currentTime", LocalDateTime.now());
        model.addAttribute("visitor", visitor);
        model.addAttribute("count", visitorCount);
        return "hey";
    }

    @GetMapping
    public String getHome() {
        return "home";
    }
}
