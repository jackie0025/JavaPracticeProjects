package jackie.studio04;

public class SetThread implements Runnable {
	private Student student;
	private int i = 0;

	public SetThread(Student student) {
		// TODO Auto-generated constructor stub
		this.student = student;
	}

	@Override
	public void run() {

		while (true) {
			synchronized (student) {
				// TODO Auto-generated method stub
				// Student student = new Student();
				if (i % 2 == 0) {
					student.name = "jackie";
					student.age = 18;
				} else {
					student.name = "Bob";
					student.age = 60;
				}
				i++;
			}
		}

	}

}
