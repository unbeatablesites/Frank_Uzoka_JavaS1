package com.company;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TelevisionReader {

    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();

            List<Television> televisionList;

            televisionList = mapper.readValue(new File("televisions.json"), new TypeReference<List<Television>>(){});

            for (Television tv : televisionList) {
                System.out.println("================");
                System.out.println(tv.getBrand());
                System.out.println(tv.getModel());
                System.out.println(tv.getPrice());
                System.out.println(tv.getScreenSize());
            }

        } catch (IOException e) {
            System.out.println("ERROR: Problem encountered reading JSON file - " + e.getMessage());
        }
    }




}