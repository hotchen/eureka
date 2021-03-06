package com.gonggui.controller;

import com.gonggui.entity.Student;
import com.gonggui.repositity.StudentResposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by zhaochen on 2019-10-13.
 */
@RestController
@RequestMapping("/student")
public class StudentHandler {
    @Value("${server.port}")
    private String port;
    @Autowired
    private StudentResposity resposity;

    @GetMapping("findAll")
    public Collection<Student> findAll(){
    return  resposity.findAll();
    }

    @GetMapping("index")
    public String index(){
        return "当前端口"+ port;
    }
}
