package com.macrosoftas.templatespringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macrosoftas.templatespringboot.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
