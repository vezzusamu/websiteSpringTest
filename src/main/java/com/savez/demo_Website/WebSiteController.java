package com.savez.demo_Website;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSiteController {

    @GetMapping("/")
    public String index(){
        return "Hello from the index!";
    }

    @GetMapping("/2")
    public String index2(){
        return "Hello from the index2!";
    }
}
