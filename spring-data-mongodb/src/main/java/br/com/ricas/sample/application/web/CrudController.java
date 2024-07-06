package br.com.ricas.sample.application.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudController {

    @GetMapping("/hello")
    public String get() {
        return "Hello World";
    }
}
