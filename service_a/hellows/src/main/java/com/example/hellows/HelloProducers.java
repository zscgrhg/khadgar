package com.example.hellows;

import com.example.hello.contract.ContractC;
import com.example.hello.contract.HelloContract;
import com.zte.crm.framework.contract.annotation.Producer;

@Producer
public class HelloProducers implements HelloContract, ContractC {
    @Override
    public String hello(String name) {
        return "hello " + name;
    }

    @Override
    public String nihao(String name) {
        return "HelloContract";
    }

    @Override
    public String nihaonomapping(String name) {
        return "HelloContract";
    }

    @Override
    public String haloya(String name) {
        return "ContractC";
    }
}
