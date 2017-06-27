package generic.test6;

//public class InterImpl implements Inter<String>{
//
//	@Override
//	public void show(String t) {
//		// TODO Auto-generated method stub
//		System.out.println(t);
//	}
//
//}
public class InterImpl<T> implements Inter<T>{

	@Override
	public void show(T t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
}