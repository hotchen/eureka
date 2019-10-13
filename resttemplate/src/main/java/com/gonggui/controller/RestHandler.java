package com.gonggui.controller;

import com.gonggui.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * Created by zhaochen on 2019-10-13.
 */
@RestController
@RequestMapping("rest")
public class RestHandler {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("findAll")
    public Collection<Student> findAll(){
        return  restTemplate.getForEntity("http://localhost:8010/student/findAll",Collection.class).getBody();
    }
}
