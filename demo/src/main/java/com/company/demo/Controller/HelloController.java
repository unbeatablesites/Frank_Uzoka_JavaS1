package com.company.demo.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value="/hello", method= RequestMethod.GET)
    String words(){

        String words = "Your math is ";

        return words + sayHello();

    }

    int sayHello(){

        int num1 =4;
        int num2 =4;
        int sum = num1+num2;


        System.out.println("Working");

        return sum;
    }
                    }
