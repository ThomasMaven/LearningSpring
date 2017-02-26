package eu.tomaka.repo;

import java.util.ArrayList;
import java.util.List;

import eu.tomaka.module.Customer;

public class HibernateCustomerRepoImpl implements CustomerRepo {

	private String username;
	private String password;
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
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
