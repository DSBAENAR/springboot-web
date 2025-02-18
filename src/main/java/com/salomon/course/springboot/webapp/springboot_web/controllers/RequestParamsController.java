package com.salomon.course.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.salomon.course.springboot.webapp.springboot_web.models.dto.ParamDTO;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {
    
    @RequestMapping("/foo")
    public ParamDTO foo(@RequestParam(required = false, defaultValue = "Hola que tal") String message){
        ParamDTO param = new ParamDTO();
        param.setMessage(message);
        return param;
    }
}
