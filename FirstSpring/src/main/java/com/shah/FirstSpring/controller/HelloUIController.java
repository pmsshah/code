package com.shah.FirstSpring.controller;

import com.shah.FirstSpring.model.Hello;
import com.shah.FirstSpring.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class HelloUIController {

    @GetMapping("/greeting/{input}")
    public String greeting(@PathVariable String input, Model model) {
        String welcomeMessage = "Hi " + input + " welcome!";
        model.addAttribute("message", welcomeMessage);
        //System.out.println(model.getAttribute("message"));
        return "welcome";
    }
}
