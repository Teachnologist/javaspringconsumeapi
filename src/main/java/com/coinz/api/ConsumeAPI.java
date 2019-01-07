package com.coinz.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.application.Application;
import org.json.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Array;
import java.util.*;


public class ConsumeAPI {

    public final String uri = "https://data.cityofchicago.org/resource/jdis-5sry.json";


/*displays data as string*/
    public String getData(){
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

    public void stringAsList(){


    }

    public List<ObjectTest[]> getArray(){
        RestTemplate restTemplate = new RestTemplate();
        String jsonString = restTemplate.getForObject(uri, String.class);
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
        List<ObjectTest[]> result = null;
        try {
            result = mapper.readValue(jsonString, List.class);
        } catch (Exception e) {
            System.out.println("t Invalid results");
            System.out.print(e);
            System.out.println("b Invalid results");
        }


        return result;
    }

}
