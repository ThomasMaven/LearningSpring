package eu.tomaka.service;

import java.util.List;

import eu.tomaka.module.Customer;
import eu.tomaka.repo.CustomerRepo;




public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepo customerRepo;
	
	public CustomerServiceImpl() {
		
	}

	public CustomerServiceImpl(CustomerRepo customerRepo) {
		this.customerRepo = customerRepo;
		
	}
	
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
