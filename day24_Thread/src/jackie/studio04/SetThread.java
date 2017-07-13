package jackie.studio04;

public class SetThread implements Runnable {
	private Student student;

	public SetThread(Student student) {
		// TODO Auto-generated constructor stub
		this.student = student;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Student student = new Student();
		student.name = "jackie";
		student.age = 18;
	}

}
