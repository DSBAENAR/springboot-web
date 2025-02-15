package com.salomon.course.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.salomon.course.springboot.webapp.springboot_web.models.User;
import org.springframework.web.bind.annotation.RequestParam;



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

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = Arrays.asList(new User("Pepe", "Woods"),
        new User("lalo", "perez","lalo@correo.co"),
        new User("Salomon", "Baena","mail@org.edu"),
        new User("Santiago", "Vega"));
        model.addAttribute("users", users);
        model.addAttribute("title","Listado usuarios:" );
        return "list";
    }
    

}
