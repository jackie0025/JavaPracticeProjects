package jackie.studio.test;


import java.util.Scanner;

import jackie.studio.dao.UserDao;
import jackie.studio.dao.impl.UserDaoImpl;
import jackie.studio.pojo.User;

/**
 * 用户测试类
 * 
 * @author J.Z
 * @version V1.0
 *
 */
public class UserTest {
	public static void main(String[] args) {
		for(;;){
			System.out.println("----------欢迎使用JZstudio---------");
			System.out.println("1.登录");
			System.out.println("2.退出");
			System.out.println("3.注册");
			System.out.println("请输入你的选择：");
			
			// 键盘录入：
			Scanner scanner = new Scanner(System.in);
			//
			String choiceStr = scanner.nextLine();
			//
			// 多态用法
			UserDao uDao = new UserDaoImpl();
			// 具体类用法
			// UserDaoImpl uImpl=new UserDaoImpl();
			switch (choiceStr) {
			case "1":
				System.out.println("----------登录界面---------");
				System.out.println("请输入用户名：");
				String username = scanner.nextLine();
				System.out.println("请输入密码：");
				String password = scanner.nextLine();
				boolean flag = uDao.isLogin(username, password);
				if (flag) {
					System.out.println("登录成功");
					scanner.close();
					System.exit(0);
				}else {
					System.out.println("登录失败");
				}
				break;
			case "2":
				System.out.println("再见^_^");
				System.exit(0);
				break;
			case "3":
				System.out.println("----------注册界面---------");
				System.out.println("请输入用户名：");
				String newUsername = scanner.nextLine();
				System.out.println("请输入密码：");
				String newPassword = scanner.nextLine();
	
				// 把用户名和密码封装到一个对象中
				User user = new User();
				user.setUsername(newUsername);
				user.setPassword(newPassword);
				// 调用注册功能
	
				uDao.regist(user);
				System.out.println("注册成功");
				break;
			default:
				System.out.println("请输入1,2,3进行选择");
				break;
			}
		}
	}
}
