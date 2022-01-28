package com.gurzelai.reparationscalendar.repositories;

import com.gurzelai.reparationscalendar.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> { //integer por el id

    Customer findCustomerById(Integer id);

    List<Customer> findByLastName(String lastName);

}
