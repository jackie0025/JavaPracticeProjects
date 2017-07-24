package jackie.studio05;

public class UserDaoImpl2 implements UserDao {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("权限校验");
		System.out.println("添加");
		System.out.println("日志记录");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("权限校验");
		System.out.println("删除");
		System.out.println("日志记录");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("权限校验");
		System.out.println("更新");
		System.out.println("日志记录");
	}

	@Override
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("权限校验");
		System.out.println("查找");
		System.out.println("日志记录");
	}

}
