package com.example.swaggerdemo.controller;

import com.example.swaggerdemo.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/swagger")
public class SwaggerDemoController {

    @GetMapping("/demo1")
    public Map<String, String> Demo1(){

        HashMap<String, String> result = new HashMap<>();
        result.put("id", "11" +
                "");
        result.put("name", "啊啊啊啊");
        return result;

    }

    @PostMapping("/demo2")
    public User demo2(@RequestBody User user){
        return user;
    }
}
