package com.Inventory.Management.System.demo.inventory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Maincontroller {
    @RequestMapping (value = "/hello", method = RequestMethod.GET)
    public String Welcome()
    {
        return "Hello world";
    }

    @RequestMapping(value = "/helloPost", method = RequestMethod.POST)
    public String welcomePost() {
        return "Welcome NSBM From POST";
    }
}
