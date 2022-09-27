package TestRi2.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="products")
public class Products {

	    @Id 
	    private int pid;
	    private String pname;
	    private int qty;
	    private int price;
		
	    
	    public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
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
		public Products() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Products(int pid, String pname, int qty, int price) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.qty = qty;
			this.price = price;
		}
		@Override
		public String toString() {
			return "Products [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + "]";
		}
		
}
