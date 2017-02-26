import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eu.tomaka.service.CustomerService;

public class App {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		
		CustomerService service = applicationContext.getBean("customerService", CustomerService.class);
		System.out.println(service);
		System.out.println(service.findAll().get(0).getName());
		
		CustomerService service2 = applicationContext.getBean("customerService", CustomerService.class);
		System.out.println(service2);
		System.out.println(service2.findAll().get(0).getName());
	}

}
