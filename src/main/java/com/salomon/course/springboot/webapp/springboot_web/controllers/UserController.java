package com.salomon.course.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salomon.course.springboot.webapp.springboot_web.models.User;


@Controller
public class UserController {
    
    @GetMapping("/details") //Petición que es a traves de un URL de un navegador
    public Map<String,Object> details(Model model) {
        User user = new User("Salomon", "Baena");
        Map<String,Object> body = new HashMap<>();
        user.setEmail("dsbaenar@gmail.com");
        body.put("title","Hola Mundo Spring Boot");
        body.put("user",user);
        return body; //Retorna el nombre de la vista
    }

}
