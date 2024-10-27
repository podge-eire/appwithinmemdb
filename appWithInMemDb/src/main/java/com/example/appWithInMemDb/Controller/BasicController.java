package com.example.appWithInMemDb.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {


    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!!";
    }


}
