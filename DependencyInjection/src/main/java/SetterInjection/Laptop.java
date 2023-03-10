package SetterInjection;

public class Laptop {
private int id;
private String name;
private String processor;
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
public String getProcessor() {
	return processor;
}
public void setProcessor(String processor) {
	this.processor = processor;
}

	public void Printdetails() {
		System.out.println("Id  "+ id);
		System.out.println("name  "+ name);
		System.out.println("processor  "+ processor);
	}
}
