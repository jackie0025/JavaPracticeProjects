package jackie.studio05;

public class UserDaoDemo {
	public static void main(String[] args) {
		UserDao uDao=new UserDaoImpl();
		
		uDao.add();
		uDao.delete();
		uDao.update();
		uDao.find();
		
		//Actually not every have the authorization to do these method
		//logs
		//who did this
		System.out.println("____________");
		UserDao uDao2=new UserDaoImpl2();
		uDao2.add();
		uDao2.delete();
		uDao2.update();
		uDao2.find();
		//���磬���и���ʦ�࣬ѧ���඼Ҫʵ�����Ʋ���
		//����Ҫ����ܶ���������
		
		
	}
}
