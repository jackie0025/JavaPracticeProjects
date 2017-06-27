class FunctionReload{
	public static void main(String[] args){
		byte b1=3;
		byte b2=4;
		System.out.println("byte: "+compare(b1,b2));
		
		short s1 =5;
		short s2 =5;
		System.out.println("short: "+compare(b1,b2));
	
	}
	
	//byte
	public static boolean compare(byte a, byte b){
		System.out.println("byte");
		return a==b;
	}
	//short
	public static boolean compare(short a, short b){
		System.out.println("short");
		return a==b;
	}
	//int
	public static boolean compare(int a, int b){
		System.out.println("int");
		return a==b;
	}
	//long
	public static boolean compare(long a, long b){
		System.out.println("long");
		return a==b;
	}
}