package classDemo;

class Phone{
	private String brand;
	private int price;
	private String color;
	
	//无参构造方法
	public Phone(){}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
public class PhoneTest {
	public static void main(String[] args) {
		Phone phone= new Phone();
		phone.setBrand("Nokia");
		phone.setPrice(199);
		phone.setColor("lightBlue");
		
		System.out.println(phone.getBrand()+"."+phone.getColor()+"."+phone.getPrice());
	}
}
