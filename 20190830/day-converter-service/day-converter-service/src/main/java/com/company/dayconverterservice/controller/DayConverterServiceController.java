package com.company.dayconverterservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class DayConverterServiceController {

    @RequestMapping(value = "/dayConverter/{input}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String echo(@PathVariable int input) {
        if (input < 1 || input > 7) {
            throw new IllegalArgumentException("Input must be between 1 and 7.");
        }
        switch (input) {
            case 1:
                return ("Monday");

            case 2:
                return("Tuesday");
            case 3:
                return("Wednesday");

            case 4:
                return("Thursday");

            case 5:
                return("Friday");

            case 6:
                return("Saturday");

            case 7:
                return("Sunday");

            default:
                return("You have entered an invalid number. You must enter a number between 1 and 7.");
        }
    }
}

