package TestRi2.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TestRi2.Entity.Employi;
import TestRi2.Repository.EmpRepository;

@Service
public class EmpService {

	@Autowired
	private EmpRepository erepo;
	
	
	public Employi addEmployi(Employi e) {
		return this.erepo.save(e);
	}
	
	public List<Employi> getAllEmpl(Employi e){
		return this.erepo.findAll();
	}
	
//	get by name method
	public List<Employi> GetByName(String name){
		return this.erepo.getByName(name);
	}

//get by city	
	public List<Employi> GetBycity(String city){
		return this.erepo.getByCity(city);
	}
	
	
	
}
