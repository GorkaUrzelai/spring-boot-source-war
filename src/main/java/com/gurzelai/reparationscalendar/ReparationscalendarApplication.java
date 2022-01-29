package com.gurzelai.reparationscalendar;

import com.gurzelai.reparationscalendar.model.Customer;
import com.gurzelai.reparationscalendar.repositories.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class ReparationscalendarApplication {

    public static final Logger log = LoggerFactory.getLogger(ReparationscalendarApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ReparationscalendarApplication.class, args);
    }

/*
    @Bean
    public CommandLineRunner demo(CustomerRepository repository) {
        return (args) -> {
            log.info("-----------------STARTING----------------");
            log.info("-----------------STARTING----------------");
            log.info("-----------------STARTING----------------");
            // save a few customers
            repository.save(new Customer("Jack", "Bauer"));
            repository.save(new Customer("Chloe", "O'Brian"));
            repository.save(new Customer("Kim", "Bauer"));
            repository.save(new Customer("David", "Palmer"));
            repository.save(new Customer("Michelle", "Dessler"));

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Customer customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Optional<Customer> customer = repository.findById(1);
            log.info("Customer found with findById(1L):");
            log.info("--------------------------------");
            log.info(customer.toString());
            log.info("");

            // fetch customers by last name
            log.info("Customer found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            repository.findByLastName("Bauer").forEach(bauer -> {
                log.info(bauer.toString());
            });
            log.info("");
        };
    }*/
}
