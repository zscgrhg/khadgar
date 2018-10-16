package com.example.hello.contract;

import com.zte.crm.framework.contract.annotation.Contract;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Contract
public interface ContractB {
    @GetMapping("/nihao/{name}")
    String nihao(@PathVariable("name") String name);

    String nihaonomapping(@PathVariable("name") String name);
}
