package com.laboratorio.SpringBoot_03;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Mensaje {
    private String saludo;
    private String destino;
    private String framework;

    public void saludar(){
        System.out.println("Holita " + destino + " desde " + framework);
    }


}
