package com.laboratorio.SpringBoot_02.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludarController {
    @GetMapping(value="saludar/{nombre}/{apellido}")
    public String saludar(@PathVariable String nombre,
                          @PathVariable String apellido){
        return "Disfruta cada dia de tu vida "+nombre+
                " "+apellido;
    }
}
