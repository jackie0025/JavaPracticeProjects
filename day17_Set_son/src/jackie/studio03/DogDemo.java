package jackie.studio03;

import java.util.HashSet;

public class DogDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Dog> dogs=new HashSet<>();
		
		//create objects
		Dog dog=new Dog("����",19,"�л���԰",'��');
		Dog dog2=new Dog("��ٴ",20,"��������",'��');
		Dog dog3=new Dog("κ����",19,"������",'Ů');
		Dog dog4=new Dog("����Ӣ",19,"������",'Ů');
		Dog dog5=new Dog("����Ӣ",19,"������",'Ů');
		
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
