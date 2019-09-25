package com.trilogyed.qoutecloudservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RefreshScope
public class QouteCloudServiceController {

    @Value("${quote1}")
    private  String qoute1;

    @Value("${quote2}")
    private  String qoute2;

    @Value("${quote3}")
    private  String qoute3;

    @Value("${quote4}")
    private  String qoute4;

    @Value("${quote5}")
    private  String qoute5;

    @Value("${quote6}")
    private  String qoute6;

    @Value("${quote7}")
    private  String qoute7;

    @Value("${quote8}")
    private  String qoute8;



    private  Map<Integer, String> qoutesMap = new HashMap<>();
    private void loadMap(){

            qoutesMap.put(1,qoute1);
            qoutesMap.put(2,qoute2);
            qoutesMap.put(3,qoute3);
            qoutesMap.put(4,qoute4);
            qoutesMap.put(5,qoute5);
            qoutesMap.put(6,qoute6);
            qoutesMap.put(7,qoute7);
            qoutesMap.put(8,qoute8);

    }

    @RequestMapping(value="/qoute", method = RequestMethod.GET)
    public String qouteCloud(){

        loadMap();
        Random rand =  new Random();

        return qoutesMap.get(rand.nextInt(8)+1);

    }


}
