package com.projeto;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/web")
/**
 * controllerEmpresa
 */
public class controllerEmpresa {
    @GetMapping(value = "/{nome}") //verboHttpMapping, diz qual o verbo http que eu espero 
    public String exemplo(@PathVariable("nome") String name) {
        return "Olá " + name;
    }
}