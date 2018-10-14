package com.example.comsumer.demo;

import com.example.hello.contract.HelloContract;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "hello",url="http://localhost:8881")
public interface HelloClient extends HelloContract {

}
