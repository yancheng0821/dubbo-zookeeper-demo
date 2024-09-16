package com.example.consumer;

import com.example.api.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceConsumer {

    @DubboReference
    private HelloService helloService;

    public String sayHello(String name) {
        return helloService.sayHello(name);
    }
}
