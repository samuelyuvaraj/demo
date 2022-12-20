package com.example.demo.controller;

import com.example.demo.entity.dataEntity;
import com.example.demo.repo.Datarepo;
import com.example.demo.service.Mapper;
import com.example.demo.service.roleService;


import lombok.extern.log4j.Log4j2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
public class demoController {
    public final Datarepo datarepo;
    public final roleService roleservice;
    public demoController(Datarepo datarepo, roleService roleservice) {
        this.datarepo = datarepo;
        this.roleservice = roleservice;
    }

    @GetMapping("/getall")
    public List<dataEntity> getall(){
        List<dataEntity> datas = datarepo.findAll();
        log.info("datas {}", Mapper.toJASONS(datas));
        return datas;
    }
    @PostMapping("/create")
    public dataEntity createdata(@RequestBody dataEntity dataentity){
        dataEntity datas = datarepo.save(dataentity);
        log.info("create : {}",dataentity);
        return datas;
    }


}

