package br.edu.catolica.workshop.service;

import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

@Service
public class WorkService {

    public void valid(String name){
        if(Strings.isBlank(name)){
            throw new IllegalArgumentException("Invalid name!");
        }
    }
}
