package com.example.demodeploy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControler {
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
