package eu.tomaka.repo;

import java.util.List;

import eu.tomaka.module.Customer;

public interface CustomerRepo {

	List<Customer> findAll();

}