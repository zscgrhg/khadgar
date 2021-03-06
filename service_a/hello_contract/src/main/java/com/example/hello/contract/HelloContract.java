package com.example.hello.contract;

import com.zte.crm.framework.contract.annotation.Contract;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Contract
public interface HelloContract extends ContractA, ContractB {
    @GetMapping("/hello/{name}")
    String hello(@PathVariable("name") String name);
}
