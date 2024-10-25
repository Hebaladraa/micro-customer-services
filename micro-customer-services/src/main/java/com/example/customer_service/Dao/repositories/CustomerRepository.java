package com.example.customer_service.Dao.repositories;

import com.example.customer_service.Dao.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {


}
