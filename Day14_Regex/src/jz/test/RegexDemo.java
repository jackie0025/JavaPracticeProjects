package jz.test;

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(checkQQ("01111111"));
		//System.out.println(checkPhoneNum("15888880000"));
		System.out.println(checkEmail("1@163.com"));
	}
	
	public static boolean checkEmail(String address) {
		return address.matches("[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+");
		//[a-zA-Z_0-9]��Щ�ַ�		+	���ֶ��
		//@
		//[a-zA-Z_0-9]����{2,6}��
		//  \\. ��   .
		// ()+  �����ڵ����ݳ��ֶ��
	}
	public static boolean checkPhoneNum(String num){
		return num.matches("1[358]\\d{9}");//1,3/5/8,����Ϊ9λ����
	}
	
	/**
	 * ���QQ������ȷ��
	 * ����0��ͷ
	 * ���봿����
	 * ����5~15
	 * @param qq
	 * @return
	 */
	public static boolean checkQQ(String qq){
		
	/*	boolean flag=true;
	 	if (qq.length()>=5&&qq.length()<=15) {
			//����0��ͷ
			if (!qq.startsWith("0")) {
				char[] cs=qq.toCharArray();
				for (char c : cs) {
					if (!Character.isDigit(c)) {
						flag=false;
						break;
					}
				}
			}else {
				flag=false;
			}
		}else {
			flag=false;
		}
		return flag;
		*/
		
		//return qq.matches("[1-9][0-9]{4,15}");
		return qq.matches("[1-9]\\d{4,15}");
		
		
	}

}
