package com.company.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Fredi Hernandez
 */
@RestController
public class TestController {

    @CrossOrigin
    @GetMapping("/test")
    public String isRunning() {
        return "OK. BACK-END IS UP.";
    }

    @CrossOrigin
    @GetMapping("/getSuma")
    public int getSuma() {
        int valor1 = 5;
        int valor2 = 5;
        int resultado = valor1 + valor2;
        return resultado;
    }

    @CrossOrigin
    @GetMapping("/getCompareColors")
    public boolean getCompareColors() {
        String color1 = "Negro";
        String color2 = "Verde";
        return color1.equals(color2);
    }
}
