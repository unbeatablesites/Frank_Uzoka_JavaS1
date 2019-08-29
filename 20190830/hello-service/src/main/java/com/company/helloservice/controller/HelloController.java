package com.company.helloservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
public class HelloController {

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String hello(@PathVariable @Valid  String name) {
        System.out.println("Hello, "+ name);
        return "Hello " + name +" have a nice day!!!";
    }
}
