package eu.tomaka.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import eu.tomaka.module.Customer;

@Repository("customerRepo")
public class HibernateCustomerRepoImpl implements CustomerRepo {

	/* (non-Javadoc)
	 * @see eu.tomaka.repo.CustomerRepo#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setName("Jan");
		customer.setSurname("Kowalski");
		customers.add(customer);
		return customers;

	}

}
