package TestRi2.Dto;

import TestRi2.Entity.Employi;

public class OrderRequest {

	
	
	private Employi employi;

	public Employi getEmployi() {
		return employi;
	}

	public void setEmployi(Employi employi) {
		this.employi = employi;
	}

	public OrderRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderRequest(Employi employi) {
		super();
		this.employi = employi;
	}

	@Override
	public String toString() {
		return "OrderRequest [employi=" + employi + "]";
	}
	
	
	
}
