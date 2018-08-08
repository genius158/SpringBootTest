package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    HalloServer halloServer;

    @RequestMapping(value = "/hallo/{word}", method = RequestMethod.GET)
    public String helloWorld(@PathVariable("word") String word) {
        return halloServer.hallo(word);
    }
}
