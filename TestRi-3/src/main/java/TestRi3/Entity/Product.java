package TestRi3.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	 @Id
	 private int pid;
	 private String ProductName;
	 private int qty;
	 private int price;
	
	 public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		this.ProductName = productName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String productName, int qty, int price) {
		super();
		this.pid = pid;
		this.ProductName = productName;
		this.qty = qty;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", ProductName=" + ProductName + ", qty=" + qty + ", price=" + price + "]";
	}
	 
	 	
}
