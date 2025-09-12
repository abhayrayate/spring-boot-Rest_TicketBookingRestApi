package in.abhayit.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.abhayit.binding.Customer;

@RestController
public class CustomerRestController {

	@GetMapping("/customer")
	public Customer getCustomer()
	{
	Customer c =new Customer();
	c.setName("John");
	c.setEmail("John@123.com");
	c.setGender("Male");
	
		return c;
	}
}
