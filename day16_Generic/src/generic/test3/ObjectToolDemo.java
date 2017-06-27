package generic.test3;
/*
 * 以前我们用Object表示任意类型
 * 存在向下转型的问题
 * 这样的程序不安全，所以JDK5以后引入了泛型提高程序的安全性
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
		//隐含了类型转的问题
		String string2=(String) objectTool.getObject();
		System.out.println(string2);
	}

}
