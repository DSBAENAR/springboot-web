package com.salomon.course.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.salomon.course.springboot.webapp.springboot_web.models.dto.ParamDTO;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {
    
    @GetMapping("/foo")
    public ParamDTO foo(@RequestParam(required = false, defaultValue = "Hola que tal") String message){
        ParamDTO param = new ParamDTO();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/bar")
    public ParamDTO bar(@RequestParam String text, @RequestParam Integer code){
        ParamDTO params = new ParamDTO();
        params.setMessage(text);
        params.setCode(code);
        return params;
    }
}
