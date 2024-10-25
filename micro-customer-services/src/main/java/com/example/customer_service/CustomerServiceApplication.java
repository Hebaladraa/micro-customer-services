package com.example.customer_service;

import com.example.customer_service.Dao.entities.Customer;
import com.example.customer_service.Dao.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.example.customer_service.Dao.entities")
@EnableJpaRepositories(basePackages = "com.example.customer_service.Dao.repositories")
public class CustomerServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(Customer.builder().name("heba").email("hebaladraa@gmail.com").build());
			customerRepository.save(Customer.builder().name("ikram").email("ikramsamami@gmail.com").build());
		};
	}

}

