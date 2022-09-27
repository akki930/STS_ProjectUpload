package TestRi2.Dto;



public class OrderResponse {

	private String name;
	private String pname;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public OrderResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderResponse(String name, String pname) {
		super();
		this.name = name;
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "OrderResponse [name=" + name + ", pname=" + pname + "]";
	}

	
	
}
