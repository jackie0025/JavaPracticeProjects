package jackie.studio;

public class Person {
	private String name;
	int age;
	public String address;
	public Person(){
		
	}
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void show() {
		System.out.println("show");
	}
	public void  method(String string) {
		System.out.println("method"+string);
	}
	private void function(){
		System.out.println("function");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
}
