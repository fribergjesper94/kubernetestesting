package com.example.kubernetestesting.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jesper Friberg Spång
 * Date: 2021-09-16
 * Time: 12:05
 * Project: kubernetestesting
 * Copyright: MIT
 */

@RestController
public class HelloWorld {


    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, world!";
    }

}
