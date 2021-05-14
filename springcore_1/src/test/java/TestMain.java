import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import address.customer.Customer;

class TestDriver {

	@Test
	void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Customer customer = (Customer) context.getBean("customer");
		assertAll(
		()->assertEquals(cust.getCname,"Ram"),
		()->assertEquals(cust.getCid(),1234),
		()->assertEquals(cust.getCcontact(),97205345373L),
		()->assertEquals(cust.getCaddress().getStreet(),"Street Colony"),
		()->assertEquals(cust.getCaddress().getCity(),"bhimavaram"),
		()->assertEquals(cust.getCaddress().getZip(),534243),
		()->assertEquals(cust.getCaddress().getCountry(),"India")
	);
	}

}