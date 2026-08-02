package com.laboratorio.SpringBoot_03.controller;

import com.laboratorio.SpringBoot_03.Mensaje;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HolaController {

//    Metodo que devuelve un mensaje
    @GetMapping("/hola")
    public String hola() {
        return "Hola Mundo desde Spring Boot";
    }

    @GetMapping("/hola/{nombre}")
    public String hola(@PathVariable String nombre) {
        return "Hola " + nombre + " desde Spring Boot";
    }

    @GetMapping("/saludo")
    public Mensaje saludo() {
        return new Mensaje("Hola ", "Mundo", "Spring Boot");
    }
}
