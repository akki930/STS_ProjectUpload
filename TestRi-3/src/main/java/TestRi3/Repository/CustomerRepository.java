package TestRi3.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import TestRi3.Dto.OrderResponse;
import TestRi3.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	@Query("SELECT new TestRi3.Dto.OrderResponse(c.name, p.ProductName) FROM Customer c JOIN c.product p")
	public List<OrderResponse> getJoinInfo();
}
