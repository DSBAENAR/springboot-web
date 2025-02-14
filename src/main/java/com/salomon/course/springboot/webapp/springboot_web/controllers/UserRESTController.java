package com.salomon.course.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salomon.course.springboot.webapp.springboot_web.models.User;
import com.salomon.course.springboot.webapp.springboot_web.models.dto.UserDto;


@RestController
@RequestMapping("/api") //Ruta base del api, para accder es h
public class UserRESTController {

    @GetMapping("/details") //Petición que es a traves de un URL de un navegador
    public UserDto details() {
        UserDto userDto = new UserDto();
        User user = new User("Salomon", "Baena");
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");
        // Map<String,Object> body = new HashMap<>();
        // body.put("title","Hola Mundo Spring Boot");
        // body.put("user",user);
        return userDto; //Retorna el nombre de la vista
    }


    @GetMapping("/details-map") //Petición que es a traves de un URL de un navegador
    public Map<String,Object> detailsMap() {
        User user = new User("Salomon", "Baena");
        Map<String,Object> body = new HashMap<>();
        body.put("title","Hola Mundo Spring Boot");
        body.put("user",user);
        return body; //Retorna el nombre de la vista
    }

}
