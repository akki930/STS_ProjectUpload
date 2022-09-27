package TestRi2.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import TestRi2.Dto.OrderResponse;
import TestRi2.Entity.Employi;

@Repository
public interface EmpRepository extends JpaRepository<Employi, Integer> {
	
	
//	 find employi by name  
//	List<Employi> getByName(String name);

//	 find employi by city  
//	List<Employi> getByCity(String city);
	
//	get products name and the employi name associated with it
	@Query("SELECT new TestRi2.Dto.OrderResponse(e.name, p.pname) FROM Employi e JOIN e.products p") 
	public List<OrderResponse> getjoinInfo();
	
//	 find employee by name using custom query  
	@Query("from Employi where name=:empname")
	List<Employi> getByName(@Param ("empname") String name);

	
//	 find employee by city using custom query 
	@Query("select e from Employi e where e.city=:e")
	List<Employi> getByCity(@Param("e") String city);
	

}
