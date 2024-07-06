package br.com.ricas.sample.domain;

import org.springframework.data.annotation.Id;

public class Product {

    private @Id String id;
    private String name;
}
