package com.gurzelai.reparationscalendar.controllers;

import com.gurzelai.reparationscalendar.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @Autowired //inject the customerRepository bean
    private CustomerRepository customerRepository;

    @RequestMapping({"/home"})
    public String home() {
        return "index";
    }
}
