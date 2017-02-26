import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eu.tomaka.service.CustomerService;
import eu.tomaka.service.CustomerServiceImpl;

public class App {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		
		CustomerService service = applicationContext.getBean("customerService", CustomerService.class);
		System.out.println(service.findAll().get(0).getName());
	}

}
