package com.xteam.app.Controllers;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LoginController {
   

    @GetMapping("/login")
    public String saludo(){

        String saludo = "Hola, Bienvenido a Xteam";

        HashMap<String,String> params = new HashMap<>();

        params.put("saludo", saludo);

        return saludo;
    }

}
