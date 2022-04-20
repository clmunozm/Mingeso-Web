package com.mingeso.mingeso;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensajeController {

    @GetMapping("/")
    public String MostrarMensaje(){
        return ("Aplicación web muy simple");
    }

    @GetMapping("/mensaje")
    public String Mensaje(){
        return ("Hola Mundo");
    }
}
