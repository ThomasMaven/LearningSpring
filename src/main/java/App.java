import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eu.tomaka.service.CustomerService;
import eu.tomaka.service.CustomerServiceImpl;

public class App {

	public static void main(String[] args) {

//		CustomerService service = new CustomerServiceImpl();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//setter injection
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		System.out.println(service.findAll().get(0).getName());
		
		//constructor injection
		CustomerService serviceConstruct = appContext.getBean("customerServiceConst", CustomerService.class);
		System.out.println(serviceConstruct.findAll().get(0).getName());
	}

}
