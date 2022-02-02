package reparaciones.controller;

import org.springframework.stereotype.Controller;
import reparaciones.ReparationscalendarApplication;
import reparaciones.domain.Customer.Model.Customer;
import reparaciones.domain.Customer.DAO.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired //inject the customerRepository bean
    private CustomerRepository customerRepository;

}
