package eu.tomaka.service;

import java.util.List;

import eu.tomaka.module.Customer;
import eu.tomaka.repo.CustomerRepo;
import eu.tomaka.repo.HibernateCustomerRepoImpl;




public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepo customerRepo = new HibernateCustomerRepoImpl();
	

	/* (non-Javadoc)
	 * @see eu.tomaka.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}
}
