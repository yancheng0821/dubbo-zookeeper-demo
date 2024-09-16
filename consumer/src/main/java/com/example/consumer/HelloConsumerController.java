package com.example.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConsumerController {

    @Autowired
    private HelloServiceConsumer helloServiceConsumer;

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return helloServiceConsumer.sayHello(name);
    }
}
