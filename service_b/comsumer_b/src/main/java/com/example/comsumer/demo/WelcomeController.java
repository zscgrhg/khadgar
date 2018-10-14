package com.example.comsumer.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @Autowired
    HelloClient helloClient;
    @GetMapping("/wow/{name}")
    String hello(@PathVariable("name") String name){
        return helloClient.hello(name);
    }
}
