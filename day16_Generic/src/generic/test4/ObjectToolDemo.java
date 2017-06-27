package generic.test4;

public class ObjectToolDemo {
	public static void main(String[] args) {
		// ObjectTool objectTool=new ObjectTool<>();
		//
		// objectTool.setObj(new String("jj"));
		// String string=(String) objectTool.getObj();
		// System.out.println(string);
		//
		// objectTool.setObj(new Integer(27));
		// Integer integer=(Integer) objectTool.getObj();
		// System.out.println(integer);
		//
		// //wrong usage
		// System.out.println("-------------");
		// objectTool.setObj(new Integer(27));
		// //ClassCastException: java.lang.Integer cannot be cast to
		// java.lang.String
		// //隐含了类型转的问题
		// String string2=(String) objectTool.getObj();
		// System.out.println(string2);
		ObjectTool<String> objectTool=new ObjectTool<>();

		objectTool.setObj(new String("jj"));
		String string=(String) objectTool.getObj();
		System.out.println(string);
		
		ObjectTool<Integer> objectTool2=new ObjectTool<>();
		objectTool2.setObj(new Integer(27));
		Integer integer=(Integer) objectTool2.getObj();
		System.out.println(integer);
		
		}
}
