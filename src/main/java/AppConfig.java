import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import eu.tomaka.repo.CustomerRepo;
import eu.tomaka.repo.HibernateCustomerRepoImpl;
import eu.tomaka.service.CustomerService;
import eu.tomaka.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"eu.tomaka"})
@PropertySource("app.properties")
public class AppConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}
