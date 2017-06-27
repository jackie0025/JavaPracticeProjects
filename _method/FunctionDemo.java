import java.util.Scanner;

class FunctionDemo{
	public static void main(String[] args){
		/*
		int x=10;
		int y=20;
		System.out.println(sum(x,y)+"\r\n");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("input the first data:\r\n");
		int a=sc.nextInt();
		System.out.println("input the second data:\r\n");
		int b=sc.nextInt();
		
		int result = getMax(a,b);
		System.out.println("the biger one is "+result);
		result = getMax3(a,b);
		System.out.println("the biger one is "+result);
		*/
		multiTable(10);
		
	}
	public static int sum(int a, int b){
		int c=a+b;
		return c;
	}
	public static int getMax(int a,int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
	public static int getMax3(int a,int b){
		int c=((a>b)? a:b);
		return c;
	}
	public static void multiTable(int N){
		for(int i=0;i<=N;i++ ){
			for(int j=0;j<=i;j++){
				System.out.print(j+"x"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
	}

}