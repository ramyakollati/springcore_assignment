package address.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Customer customer = (Customer) context.getBean("customer");
		customer.cust();
		Address address = (Address) context.getBean("address");
		address.add();

	}

}
