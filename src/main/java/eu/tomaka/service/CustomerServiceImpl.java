package eu.tomaka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.tomaka.module.Customer;
import eu.tomaka.repo.CustomerRepo;



@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	public CustomerServiceImpl(CustomerRepo customerRepo){
		this.customerRepo = customerRepo;
	}
	//@Autowired
	private CustomerRepo customerRepo;
	
	//@Autowired
	public void setCustomerRepo(CustomerRepo customerRepo) {
		this.customerRepo = customerRepo;
	}


	/* (non-Javadoc)
	 * @see eu.tomaka.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}
}
