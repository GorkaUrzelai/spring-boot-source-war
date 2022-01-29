package com.gurzelai.reparationscalendar.controllers;

import com.gurzelai.reparationscalendar.ReparationscalendarApplication;
import com.gurzelai.reparationscalendar.model.Customer;
import com.gurzelai.reparationscalendar.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired //inject the customerRepository bean
    private CustomerRepository customerRepository;

    @GetMapping("/list") //getCustomers() method to GET requests for /list
    public Iterable<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/find/{id}")
    //maps the value in place of the id variable from the URL to the corresponding method parameter.
    public Customer findCustomerById(@PathVariable Integer id) {
        return customerRepository.findCustomerById(id);
    }

    @PostMapping("/add") //addCustomer() method to POST requests for /add
    public String addCustomer(HttpServletRequest request) {
        ReparationscalendarApplication.log.info("-----has entrado en metodo addCustomer-----");
        Customer customer = new Customer();
        customer.setFirstName(request.getParameter("first"));
        customer.setLastName(request.getParameter("last"));
        ReparationscalendarApplication.log.info("Added customer "+ customer.toString());
        customerRepository.save(customer);
        return "Added new customer to repo!";
    }
}
