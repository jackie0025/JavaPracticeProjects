package jackie.studio.dao.impl;

import java.util.ArrayList;

import jackie.studio.dao.UserDao;
import jackie.studio.pojo.User;

/**
 * �����û������ľ���ʵ����(����ʵ�ְ汾)
 * 
 * @author J.Z
 * @version V1.0
 *
 */
public class UserDaoImpl implements UserDao {
	// �洢�û���Ϣ�ļ���
	// Ϊ�˲��ñ��˿�������private
	// Ϊ�˶��������ͬһ����Ա��������static
	private static ArrayList<User> arrayList = new ArrayList<>();

	@Override
	public boolean isLogin(String username, String password) {
		// TODO �������ϣ��ж��Ƿ��¼�ɹ�
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
		// TODO ���û���Ϣ���뼯��

		arrayList.add(user);

	}

}
