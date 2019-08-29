package com.company.calculatorservice.controller;
import com.company.calculatorservice.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Random;

@RestController
public class CalculatorController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Add createAddCalculator(@RequestBody  Add add){
        return add;
    }

    @RequestMapping(value = "/subtract", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Subtract createSubtractCalculator(@RequestBody  Subtract calculator){
        return calculator;
    }

    @RequestMapping(value = "/multiply", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Multiply createMultiplyCalculator(@RequestBody  Multiply calculator){
        return calculator;
    }

    @RequestMapping(value = "/divide", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Divide createDivideCalculator(@RequestBody  Divide calculator){
        return calculator;
    }
}