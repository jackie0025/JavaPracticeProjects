package jackie.studio.test;


import java.util.Scanner;

import jackie.studio.dao.UserDao;
import jackie.studio.dao.impl.UserDaoImpl;
import jackie.studio.pojo.User;

/**
 * �û�������
 * 
 * @author J.Z
 * @version V1.0
 *
 */
public class UserTest {
	public static void main(String[] args) {
		for(;;){
			System.out.println("----------��ӭʹ��JZstudio---------");
			System.out.println("1.��¼");
			System.out.println("2.�˳�");
			System.out.println("3.ע��");
			System.out.println("���������ѡ��");
			
			// ����¼�룺
			Scanner scanner = new Scanner(System.in);
			//
			String choiceStr = scanner.nextLine();
			//
			// ��̬�÷�
			UserDao uDao = new UserDaoImpl();
			// �������÷�
			// UserDaoImpl uImpl=new UserDaoImpl();
			switch (choiceStr) {
			case "1":
				System.out.println("----------��¼����---------");
				System.out.println("�������û�����");
				String username = scanner.nextLine();
				System.out.println("���������룺");
				String password = scanner.nextLine();
				boolean flag = uDao.isLogin(username, password);
				if (flag) {
					System.out.println("��¼�ɹ�");
					scanner.close();
					System.exit(0);
				}else {
					System.out.println("��¼ʧ��");
				}
				break;
			case "2":
				System.out.println("�ټ�^_^");
				System.exit(0);
				break;
			case "3":
				System.out.println("----------ע�����---------");
				System.out.println("�������û�����");
				String newUsername = scanner.nextLine();
				System.out.println("���������룺");
				String newPassword = scanner.nextLine();
	
				// ���û����������װ��һ��������
				User user = new User();
				user.setUsername(newUsername);
				user.setPassword(newPassword);
				// ����ע�Ṧ��
	
				uDao.regist(user);
				System.out.println("ע��ɹ�");
				break;
			default:
				System.out.println("������1,2,3����ѡ��");
				break;
			}
		}
	}
}
