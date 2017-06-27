import java.util.*;
class EncryptDemo{
	public static void main(String[] args){
			/*
		Scanner scanner=new Scanner(System.in);
		System.out.println("input ur number:");
		int[] num=new int[8];//电话信息
		int j=0;
		while(j<8){
			num[j]=scanner.nextInt();
			j++;
		}
		*/
		//int[] num={1,2,3,4,5,6,7,8};//电话信息
		Scanner scanner=new Scanner(System.in);
		System.out.println("input ur number:");
		int[] num=new int[8];
		int t=scanner.nextInt();
		int index=0;
		while(t>0){
			num[index]=t%10;
			t/=10;
			index++;
		}
		//倒序
		for(int i=0;i<=(num.length/2);i++){
			int tmp;
			tmp=num[i];
			num[i]=num[num.length-i-1];
			num[num.length-i-1]=tmp;
		}
		System.out.println("the output number:");
		for(int i=0;i<num.length;i++){
			num[i]=(num[i]+5)%10;
			System.out.print(num[i]);
		}
		System.out.println();
		for(int i=0;i<num.length;i++){
			num[i]=(num[i]+5)%10;
			System.out.print(num[i]);
		}
		
	}
}