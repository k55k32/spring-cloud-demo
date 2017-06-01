package diamond.spring.cloud.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import diamond.spring.cloud.feign.api.ComputeApi;


@RestController
public class ConsumerController {
    @Autowired
    ComputeApi computeApi;
    
    @GetMapping("/consumer-add")
    public Integer add() {
        return computeApi.add(10, 20);
    }
}
