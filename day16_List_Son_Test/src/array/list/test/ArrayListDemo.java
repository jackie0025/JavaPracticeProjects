package array.list.test;

import java.util.ArrayList;
/*
 * 需求：
 * 多个班级
 * 每个班级多个学生
 * 如何存储？
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//create big collection
		ArrayList<ArrayList<Student>> schoolArrayList=new ArrayList<ArrayList<Student>>();
		//first class
		ArrayList<Student> classArrayList=new ArrayList<Student>();
		//创建学生
		Student student=new Student("唐僧",20);
		Student student2=new Student("悟空",21);
		Student student3=new Student("八戒",22);
		Student student4=new Student("悟净",23);
		//学生进班级
		classArrayList.add(student);
		classArrayList.add(student2);
		classArrayList.add(student3);
		classArrayList.add(student4);
		//班级进学校
		schoolArrayList.add(classArrayList);
		//second class
		ArrayList<Student> classArrayList2=new ArrayList<Student>();
		//创建学生
		Student student10=new Student("孔明",20);
		Student student12=new Student("刘备",30);
		Student student13=new Student("张飞",40);
		Student student14=new Student("关羽",50);
		//学生进班级
		classArrayList2.add(student10);
		classArrayList2.add(student12);
		classArrayList2.add(student13);
		classArrayList2.add(student14);
		
		//班级进学校
		schoolArrayList.add(classArrayList2);
		//third class
		ArrayList<Student> classArrayList3=new ArrayList<Student>();
		//创建学生
		Student student20=new Student("jackie",20);
		Student student22=new Student("lucy",30);
		Student student23=new Student("bob",40);
		Student student24=new Student("lily",50);
		//学生进班级
		classArrayList3.add(student20);
		classArrayList3.add(student22);
		classArrayList3.add(student23);
		classArrayList3.add(student24);
		
		//班级进学校
		schoolArrayList.add(classArrayList3);
		
		//遍历集合
		for(ArrayList<Student> array:schoolArrayList){
			System.out.println("--------------");
			for(Student s:array){
				System.out.println(s.getName()+","+s.getAge());
			}
		}
				
	}
}
