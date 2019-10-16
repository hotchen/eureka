package controller;

import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repositity.StudentResposity;

import java.util.Collection;

/**
 * Created by zhaochen on 2019-10-16.
 */
@RestController
@RequestMapping("/student")
public class StudentHandler {
    @Value("${server.port}")
    private String port;
    @Autowired
    private StudentResposity studentResposity;
    @RequestMapping("findAll")
    public Collection<Student> findAll(){
        return  studentResposity.findAll();
    }
    @GetMapping("index")
    public String index(){
        return  "当前的端口" + this.port;
    }
}
