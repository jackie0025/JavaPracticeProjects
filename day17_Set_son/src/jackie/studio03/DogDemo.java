package jackie.studio03;

import java.util.HashSet;

public class DogDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Dog> dogs=new HashSet<>();
		
		//create objects
		Dog dog=new Dog("秦桧",19,"中华田园",'男');
		Dog dog2=new Dog("高俅",20,"拉布拉多",'男');
		Dog dog3=new Dog("魏忠贤",19,"吉娃娃",'女');
		Dog dog4=new Dog("李莲英",19,"吉娃娃",'女');
		Dog dog5=new Dog("李莲英",19,"吉娃娃",'女');
		
		dogs.add(dog);
		dogs.add(dog2);
		dogs.add(dog3);
		dogs.add(dog4);
		dogs.add(dog5);

		for(Dog d:dogs){
			System.out.println(d.getName()+","+d.getAge()+","+d.getType()+","+d.getSex());
		}
	}

}
