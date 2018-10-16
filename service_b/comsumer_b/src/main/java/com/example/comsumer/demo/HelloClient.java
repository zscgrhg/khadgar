package com.example.comsumer.demo;


import com.example.hello.contract.HelloContract;
import com.zte.crm.framework.contract.annotation.CopyDefault;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "hello", url = "http://localhost:8881")
@CopyDefault
public interface HelloClient extends HelloContract {

}
