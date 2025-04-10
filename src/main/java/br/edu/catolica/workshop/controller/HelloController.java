package br.edu.catolica.workshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ws")
public class HelloController {

    @GetMapping("/{name}")
    public String helloUser(@PathVariable("name")
                                String name){
        return "Seja bem vindo " + name;
    }
}
