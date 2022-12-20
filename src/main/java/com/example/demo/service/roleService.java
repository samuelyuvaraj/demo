package com.example.demo.service;

import com.example.demo.entity.dataEntity;
import com.example.demo.repo.Datarepo;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class roleService {
    public final Datarepo datarepo;

    public roleService(Datarepo datarepo) {
        this.datarepo = datarepo;
    }


}
