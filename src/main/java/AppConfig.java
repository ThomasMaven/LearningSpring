import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import eu.tomaka.repo.CustomerRepo;
import eu.tomaka.repo.HibernateCustomerRepoImpl;
import eu.tomaka.service.CustomerService;
import eu.tomaka.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"eu.tomaka"})
public class AppConfig {
	

}
