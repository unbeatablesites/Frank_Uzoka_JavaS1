package com.company.monthconverterservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class MonthConverterServiceController {

    @RequestMapping(value = "/monthConverter/{input}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String echo(@PathVariable int input) {
        if (input < 1 || input > 12) {
            throw new IllegalArgumentException("Input must be between 1 and 12.");
        }
        switch (input) {
            case 1:
                return ("January");
            case 2:
                return("February");
            case 3:
                return("March");
            case 4:
                return("April");
            case 5:
                return("May");
            case 6:
                return("June");
            case 7:
                return("July");
            case 8:
                return("August");
            case 9:
                return("September");
            case 10:
                return("October");
            case 11:
                return("November");
            case 12:
                return("December");
            default:
                return("You have entered an invalid number. You must enter a number between 1 and 7.");
        }
    }
}
