package jackie.studio.dao.impl;

import java.util.ArrayList;

import jackie.studio.dao.UserDao;
import jackie.studio.pojo.User;

/**
 * 这是用户操作的具体实现类(集合实现版本)
 * 
 * @author J.Z
 * @version V1.0
 *
 */
public class UserDaoImpl implements UserDao {
	// 存储用户信息的集合
	// 为了不让别人看到，用private
	// 为了多个对象共享同一个成员变量，用static
	private static ArrayList<User> arrayList = new ArrayList<>();

	@Override
	public boolean isLogin(String username, String password) {
		// TODO 遍历集合，判断是否登录成功
		boolean flag = false;
		for(User user:arrayList){
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				flag=true;
				break;
			}
		}
		
		return flag;
	}

	@Override
	public void regist(User user) {
		// TODO 把用户信息存入集合

		arrayList.add(user);

	}

}
