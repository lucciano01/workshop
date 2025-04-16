package br.edu.catolica.workshop.controller;

import br.edu.catolica.workshop.service.WorkService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ws")
public class HelloController {

    private final WorkService workService;

    public HelloController(WorkService workService) {
        this.workService = workService;
    }

    @GetMapping("/{name}")
    public String helloUser(@PathVariable("name")
                                String name){
        workService.valid(name);
        return "Seja bem vindo " + name;
    }
}
