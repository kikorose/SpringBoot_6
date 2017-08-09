package me.kikorose.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/songform")
    public String loadFormPage(Model model){
        model.addAttribute("song", new Song());
        return "songform";
    }

    @RequestMapping("/songform")
    public String loadFromPage(@ModelAttribute Song song){
        return "confirmsong";
    }
}
