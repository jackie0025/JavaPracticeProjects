package jackie.studio04;

public class GetThread implements Runnable {
	private Student student;

	public GetThread(Student student) {
		// TODO Auto-generated constructor stub
		this.student = student;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Student student=new Student();
		System.out.println(student.name+","+student.age);
	}

}
