package com.example.X.controller;

import com.example.X.API.TestApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class maincontroller {
    @GetMapping("/hello")
    public String hello(){
        return "hello pybo";
    }
    @GetMapping("/test")
    public String test() {
        return "Hello, world!";
    }
    @GetMapping("/testapi")
    public TestApi testapi() {
        TestApi testApi = new TestApi();
        testApi.setId("test");
        testApi.setPassword("password");

        return testApi;
    }


}
