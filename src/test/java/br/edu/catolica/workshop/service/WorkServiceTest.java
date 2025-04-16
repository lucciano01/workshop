package br.edu.catolica.workshop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WorkServiceTest {

    @Autowired
    private WorkService workService;

    @Test
    void validName(){
        var name = "Jose";

        Assertions.assertDoesNotThrow(() -> this.workService.valid(name));
    }

    @Test
    void invalidName(){
        var name = "Teste";

        Assertions.assertThrows(IllegalArgumentException.class,() -> this.workService.valid(name));
    }
}
