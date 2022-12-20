package com.example.demo.service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Mapper {
    public static String toJASONS(Object object){
        try{
            return new ObjectMapper().writeValueAsString(object);
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }

        return null;
    }
}
