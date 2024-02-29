package com.devsuperior.app_spring_aula.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.app_spring_aula.entities.Departament;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    
    @GetMapping
    public Departament getDepartament() {
        Departament d1 = new Departament(1L, "Tech");
        return d1;
    }

}
