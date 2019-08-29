package com.company.weatherservice.controller;
import com.company.weatherservice.model.Conditions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@RestController
public class ConditionsController {
    @RequestMapping(value = "/conditions", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Conditions createWeatherConditionAPI(@RequestBody @Valid Conditions conditions){

        Conditions cond = new Conditions();
        cond.setWindSpeed("54321");
        cond.setWindDirection("Ducati");
        cond.setSkies("Multistrada Enduro");
        cond.setPrecipitation("2018");

        return conditions;
    }

    }

