package com.salomon.course.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserRESTController {
    @GetMapping("/details2") //Petición que es a traves de un URL de un navegador
    public Map<String,Object> details() {
        Map<String,Object> body = new HashMap<>();
        body.put("title","Hola Mundo Spring Boot");
        body.put("name","Salomon");
        body.put("lastname","Baena");
        return body; //Retorna el nombre de la vista
    }

}
