package eu.tomaka.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import eu.tomaka.module.Customer;

public class HibernateCustomerRepoImpl implements CustomerRepo {
	@Value("${username}")
	private String username;
	@Value("${password}")
	private String password;

	/* (non-Javadoc)
	 * @see eu.tomaka.repo.CustomerRepo#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		System.out.println("username=" + username + " password=" + password);
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setName("Jan");
		customer.setSurname("Kowalski");
		customers.add(customer);
		return customers;

	}

}
