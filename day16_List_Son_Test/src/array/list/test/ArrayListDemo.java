package array.list.test;

import java.util.ArrayList;
/*
 * ����
 * ����༶
 * ÿ���༶���ѧ��
 * ��δ洢��
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//create big collection
		ArrayList<ArrayList<Student>> schoolArrayList=new ArrayList<ArrayList<Student>>();
		//first class
		ArrayList<Student> classArrayList=new ArrayList<Student>();
		//����ѧ��
		Student student=new Student("��ɮ",20);
		Student student2=new Student("���",21);
		Student student3=new Student("�˽�",22);
		Student student4=new Student("��",23);
		//ѧ�����༶
		classArrayList.add(student);
		classArrayList.add(student2);
		classArrayList.add(student3);
		classArrayList.add(student4);
		//�༶��ѧУ
		schoolArrayList.add(classArrayList);
		//second class
		ArrayList<Student> classArrayList2=new ArrayList<Student>();
		//����ѧ��
		Student student10=new Student("����",20);
		Student student12=new Student("����",30);
		Student student13=new Student("�ŷ�",40);
		Student student14=new Student("����",50);
		//ѧ�����༶
		classArrayList2.add(student10);
		classArrayList2.add(student12);
		classArrayList2.add(student13);
		classArrayList2.add(student14);
		
		//�༶��ѧУ
		schoolArrayList.add(classArrayList2);
		//third class
		ArrayList<Student> classArrayList3=new ArrayList<Student>();
		//����ѧ��
		Student student20=new Student("jackie",20);
		Student student22=new Student("lucy",30);
		Student student23=new Student("bob",40);
		Student student24=new Student("lily",50);
		//ѧ�����༶
		classArrayList3.add(student20);
		classArrayList3.add(student22);
		classArrayList3.add(student23);
		classArrayList3.add(student24);
		
		//�༶��ѧУ
		schoolArrayList.add(classArrayList3);
		
		//��������
		for(ArrayList<Student> array:schoolArrayList){
			System.out.println("--------------");
			for(Student s:array){
				System.out.println(s.getName()+","+s.getAge());
			}
		}
				
	}
}
