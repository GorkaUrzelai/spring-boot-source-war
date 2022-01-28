package com.gurzelai.reparationscalendar.repositories;

import com.gurzelai.reparationscalendar.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> { //integer por el id

    Customer findCustomerById(Integer id);
}
