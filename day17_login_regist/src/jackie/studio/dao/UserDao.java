package jackie.studio.dao;

import jackie.studio.pojo.User;

/**
 * �����û������Ľӿ�
 * @author J.Z
 * @version V1.0
 *
 */
public interface UserDao {
	/**
	 * �����û���¼����
	 * @param username���˻���
	 * @param password������
	 * @return ���ص�¼�Ƿ�ɹ�
	 */
	public abstract boolean isLogin(String username,String password);
	/**
	 * 
	 * @param user,�û�ע����Ϣ
	 */
	public abstract void regist(User user);
}
