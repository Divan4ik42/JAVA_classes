package edu.prg.rent.controllers.chamber.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @RequestMapping("/hello")
    String sayhello(){
        return "<h3>hello from controller</h3>";
    }
}
