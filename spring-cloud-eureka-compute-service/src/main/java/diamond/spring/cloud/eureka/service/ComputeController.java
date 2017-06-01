package diamond.spring.cloud.eureka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputeController{
    Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    public Integer add(Integer a, Integer b){
        return a + b;
    }
    
}
