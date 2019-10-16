package controller;

/**
 * Created by zhaochen on 2019-10-17.
 */

import entity.Student;
import feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("hystrix")
public class HystrixHandler {
    @Autowired
    private FeignProviderClient feignProviderClient;
    @GetMapping("findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }
    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }
}
