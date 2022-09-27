package TestRi2.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employi")
public class Employi {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	String email;
	String city;
	
	@OneToMany(targetEntity = Products.class , cascade = CascadeType.ALL)
	@JoinColumn(name="ep_fkey" , referencedColumnName = "id")
	private List<Products> products;
	
	public Employi(List<Products> products) {
		super();
		this.products = products;
	}
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employi() {
		super();
	
	}
	public Employi(int id, String name, String email, String city) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employi [id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + ", products=" + products
				+ "]";
	}
    
	
	
}
