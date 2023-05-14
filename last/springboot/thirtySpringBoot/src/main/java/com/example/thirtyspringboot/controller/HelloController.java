package com.example.thirtyspringboot.controller;

import com.example.thirtyspringboot.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Value("${name}")
    private String name;
    @Value("${person.name}")
    private String personName;

    @Value("${address[0]}")
    private String address;

    @Value("${person.age}")
    private int age;

    @Autowired
    private Environment env;

    //注入person配置
    @Autowired
    private Person person;

    @RequestMapping("/hello")
    public String helloWorld() {
        System.out.println("name " + name);
        System.out.println("person name " + personName);
        System.out.println("address " + address);
        System.out.println("age " + age);

        System.out.println("env age " + env.getProperty("person.age",Integer.class));
        System.out.println("env name " + env.getProperty("person.name"));
        System.out.println("env msg " + env.getProperty("msg1"));

        System.out.println("person " + person);
        return "hello world";
    }
}
