package com.tuttyfrutty.springbootreact;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class Controller {

    @GetMapping("/hello")
    public String Hello(@RequestParam("name") String name){
        return "Hello from " + name;
    }

}