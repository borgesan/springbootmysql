package com.borgesan.controller;


import com.borgesan.bean.RestPokemon;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class PokemonRestController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public RestPokemon greeting(@RequestParam (value="name", defaultValue="World") String name) {
        return new RestPokemon(name, "Water");
    }

}
