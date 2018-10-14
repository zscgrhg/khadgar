package com.example.hellows;

import com.example.hello.contract.HelloContract;
import com.zte.crm.framework.contract.annotation.Producers;

@Producers
public class HelloProducers implements HelloContract {
    @Override
    public String hello(String name) {
        return "hello " + name;
    }
}
