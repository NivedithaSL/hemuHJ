package DepInjection;

public class Employee {
	private String name;//index=0
	  private String email;//index=1
		

	public Employee( String name,String email) {
		super();
		this.name=name;
		this.email=email;
	}
	public void Printdetails(){
		System.out.println("name "+name);
		System.out.println("email "+email);
	}
}
