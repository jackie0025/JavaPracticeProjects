package jackie.studio.dao;

import jackie.studio.pojo.User;

/**
 * 这是用户操作的接口
 * @author J.Z
 * @version V1.0
 *
 */
public interface UserDao {
	/**
	 * 这是用户登录功能
	 * @param username，账户名
	 * @param password，密码
	 * @return 返回登录是否成功
	 */
	public abstract boolean isLogin(String username,String password);
	/**
	 * 
	 * @param user,用户注册信息
	 */
	public abstract void regist(User user);
}
