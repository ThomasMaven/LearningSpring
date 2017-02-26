package eu.tomaka.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import eu.tomaka.module.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepoImpl implements CustomerRepo {

	@Value("${someVariable}")
	private String someVariable;
	/* (non-Javadoc)
	 * @see eu.tomaka.repo.CustomerRepo#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		System.out.println("Some value from config is \"" + someVariable + "\"");
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setName("Jan");
		customer.setSurname("Kowalski");
		customers.add(customer);
		return customers;

	}

}
