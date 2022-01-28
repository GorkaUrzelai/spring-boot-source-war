package com.gurzelai.reparationscalendar.repositories;

import com.gurzelai.reparationscalendar.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer> { //integer por el id

    Customer findCustomerById(Integer id);

    List<Customer> findByLastName(String lastName);

}
