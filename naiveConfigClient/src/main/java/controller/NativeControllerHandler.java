package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaochen on 2019-10-17.
 */
@RestController
@RequestMapping("/native")
public class NativeControllerHandler {
    @Value("${server.port}")
    private String port;

    @Value("${foo}")
    private  String foo;



    @GetMapping("/index")
    public  String indec(){
        return  port + foo;
    }
}
