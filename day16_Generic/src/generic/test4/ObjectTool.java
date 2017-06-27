package generic.test4;
/*
 * <>内容可以随便给
 * <abc>,<ASDfasdf>等都可以
 * 习惯用<T>, type
 * 使用的时候T给什么类型就是什么类型，默认为Object 
 */
public class ObjectTool<T> {
	private T obj;
	
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
}
