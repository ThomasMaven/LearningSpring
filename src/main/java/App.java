import eu.tomaka.service.CustomerService;
import eu.tomaka.service.CustomerServiceImpl;

public class App {

	public static void main(String[] args) {

		CustomerService service = new CustomerServiceImpl();
		System.out.println(service.findAll().get(0).getName());
	}

}
