package eu.tomaka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.tomaka.module.Customer;
import eu.tomaka.repo.CustomerRepo;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepo customerRepo;

	public CustomerServiceImpl() {
		System.out.println("I'm in default constructor");

	}

	public CustomerServiceImpl(CustomerRepo customerRepo) {
		System.out.println("I'm in constructor - using constructor injection");
		this.customerRepo = customerRepo;
	}
	
	
	@Autowired
	public void setCustomerRepo(CustomerRepo customerRepo) {
		System.out.println("I'm in setter - using setter injection");
		this.customerRepo = customerRepo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.tomaka.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}
}
