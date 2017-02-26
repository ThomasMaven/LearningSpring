import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import eu.tomaka.repo.CustomerRepo;
import eu.tomaka.repo.HibernateCustomerRepoImpl;
import eu.tomaka.service.CustomerService;
import eu.tomaka.service.CustomerServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepo());
		return service;
	}
	
	@Bean(name = "customerRepo")
	public CustomerRepo getCustomerRepo(){
		return new HibernateCustomerRepoImpl();
	}
	

}
