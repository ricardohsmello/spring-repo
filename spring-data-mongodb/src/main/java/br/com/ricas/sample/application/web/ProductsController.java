package br.com.ricas.sample.application.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {


    @GetMapping("/find")
    public String find() {
        return "Hello World";
    }
}
