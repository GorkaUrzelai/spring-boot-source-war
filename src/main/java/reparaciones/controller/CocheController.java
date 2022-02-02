package reparaciones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import reparaciones.domain.Coche.DAO.CocheRepository;
import reparaciones.domain.Customer.DAO.CustomerRepository;

@RequestMapping("/coche")
public class CocheController {

    @Autowired
    private CocheRepository customerRepository;



}
