package jackie.studio08;
/**
 * 自定义异常测试类
 * @author jackie0025@163.com
 *
 */
public class MyException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 10000000000L;
	
	public MyException(){
		
	}
	public  MyException(String message) {
		super(message);
	}
	
}
