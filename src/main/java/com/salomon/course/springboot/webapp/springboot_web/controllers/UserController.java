package com.salomon.course.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {
    
    @GetMapping("/details") //Petición que es a traves de un URL de un navegador
    public String details(Model model) {
        model.addAttribute("title","Hola Mundo Spring Boot");
        model.addAttribute("name","Salomon");
        model.addAttribute("lastname","Baena");
        return "details"; //Retorna el nombre de la vista
    }

}
