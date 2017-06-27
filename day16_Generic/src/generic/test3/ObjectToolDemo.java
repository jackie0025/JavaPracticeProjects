package generic.test3;
/*
 * ��ǰ������Object��ʾ��������
 * ��������ת�͵�����
 * �����ĳ��򲻰�ȫ������JDK5�Ժ������˷�����߳���İ�ȫ��
 */
public class ObjectToolDemo {
	public static void main(String[] args) {
		ObjectTool objectTool=new ObjectTool();
		
		objectTool.setObject(new Integer(27));
		Integer integer=(Integer) objectTool.getObject();
		System.out.println(integer);
		
		objectTool.setObject("jj");
		String string=(String) objectTool.getObject();
		System.out.println(string);
		
		//wrong usage
		System.out.println("-------------");
		objectTool.setObject(new Integer(27));
		//ClassCastException: java.lang.Integer cannot be cast to java.lang.String
		//����������ת������
		String string2=(String) objectTool.getObject();
		System.out.println(string2);
	}

}
