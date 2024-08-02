package br.com.ricas.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class MyFunction {

    @Bean
    public Function<String, String> toUpper2() {
        return (str) -> {
            System.out.println("Original: " + str);
            return str.toUpperCase();
        };
    }
}
