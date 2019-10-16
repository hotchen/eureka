package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhaochen on 2019-10-16.
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonHandler {
    @Value("${server.port}")
    private String port;

    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("index")
    public String index(){
        return  restTemplate.getForEntity("http://serviceProvider/student/index",String.class).getBody();
    }
}
