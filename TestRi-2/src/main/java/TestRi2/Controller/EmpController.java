package TestRi2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import TestRi2.Dto.OrderRequest;
import TestRi2.Dto.OrderResponse;
import TestRi2.Entity.Employi;
import TestRi2.Repository.EmpRepository;
import TestRi2.Repository.ProductRepository;
import TestRi2.Services.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	private EmpRepository emprepo;
	@Autowired
	private ProductRepository prorepo;
	
//	handler to save an employee and the products related to him/her
	@PostMapping("/addOrder")
	public Employi orderProducts(@RequestBody OrderRequest request) {
		return emprepo.save(request.getEmployi());
	}
	
	@GetMapping("/findAllOrders")
	public List<Employi> findAllOrders(){
		return this.emprepo.findAll();
	}
	
//	handler to find joins- get employee by name and get product associated 
	@GetMapping("/findjoin") 
	public List<OrderResponse> findJoinInfo(){ 
		return this.emprepo.getjoinInfo(); 
		}

//	handler to get employee by name 
	@GetMapping("/getname/{name}")
	public List<Employi> getByNames(@PathVariable String name){
		return this.emprepo.getByName(name);
	}

//	handler to get employee by city name 
	@GetMapping("/{city}")
	public List<Employi> getByCities(@PathVariable String city){
		return this.emprepo.getByCity(city);
	}
	
	
	
	/*
	 * @GetMapping("/getname/{name}") public List<Employi> GetByName(@PathVariable
	 * Employi name){ return this.emprepo.getByName(name); }
	 */
	
	/*
	 * // add a user handler
	 * 
	 * @PostMapping("/add") public Employi addNewUser(@RequestBody Employi e) {
	 * return this.eserv.addEmployi(e); }
	 * 
	 * // get all Users
	 * 
	 * @GetMapping("/getall") public List<Employi> getAllUsers(@RequestBody Employi
	 * e){ return this.eserv.getAllEmpl(e); }
	 */
	
}
