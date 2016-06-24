package com.todo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sebastian on 24.06.16.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping("")
    public String index(Model model) {
        return "main";
    }
}
