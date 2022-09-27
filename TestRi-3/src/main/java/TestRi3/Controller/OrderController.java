package TestRi3.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import TestRi3.Dto.OrderRequest;
import TestRi3.Dto.OrderResponse;
import TestRi3.Entity.Customer;
import TestRi3.Repository.CustomerRepository;
import TestRi3.Repository.ProductRepository;

@RestController
public class OrderController {

	@Autowired
	private CustomerRepository crepo;
	@Autowired
	private ProductRepository prepo;
	
	
	@PostMapping("/PlaceOrder")
    public Customer PlaceOrder(@RequestBody OrderRequest request ) {
    	return this.crepo.save(request.getCustomer());
    }

	@GetMapping("/allOrder")
	public List<Customer> FindAllOrders(@RequestBody OrderRequest request ) {
		return this.crepo.findAll();
	}
	
	@GetMapping("/getinfo")
	public List<OrderResponse> getjoininfoCustomers(){
		return this.crepo.getJoinInfo();
	}
}
