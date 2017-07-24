package jackie.studio06;

import java.lang.reflect.Proxy;

import jackie.studio05.UserDao;
import jackie.studio05.UserDaoImpl;

public class UserDaoTest {
	public static void main(String[] args) {
		UserDao uDao = new UserDaoImpl();

		uDao.add();
		uDao.delete();
		uDao.update();
		uDao.find();
		System.out.println("____________");

		// 把uDao作为代理对象
		MyInvocationHandler handler = new MyInvocationHandler(uDao);
		UserDao proxy = (UserDao) Proxy.newProxyInstance(uDao.getClass().getClassLoader(),uDao.getClass().getInterfaces(), handler);
		System.out.println(uDao.getClass());
		System.out.println(uDao.getClass().getClassLoader());
		System.out.println(uDao.getClass().getInterfaces());
		proxy.add();
		proxy.delete();
		proxy.update();
		proxy.find();
	}
}
