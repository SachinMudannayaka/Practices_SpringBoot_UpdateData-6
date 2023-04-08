package com.updatedata.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.updatedata.demo.ODT.Odt;
import com.updatedata.demo.Service.service;

@RestController
@CrossOrigin
@RequestMapping(value="api/v0/user")
public class controller {
    @Autowired
    public service service;
    @PostMapping("/postUser")
    public Odt postUser(@RequestBody Odt odt){
        return service.postUser(odt);
    }
    @GetMapping("/getUser")
    public List<Odt>  getAllUser(){
        return service.getAllUser();
    }

    @PutMapping("/userUpdate")
    public Odt updateUser(@RequestBody Odt odt){
        return service.updateUser(odt);
    }
}
