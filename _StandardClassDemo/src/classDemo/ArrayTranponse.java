package classDemo;
/*
class Transponse{
	private int[][] data;
	public Transponse() {}
	public Transponse(int[][] data) {
		//列遍历
		for(int i=0;i<data[i].length;i++){
			for (int j = 0; j < data.length; j++) {
				this.data[j][i]=data[i][j];
			}
		}
	}
	public int[][] getData() {
		return data;
	}
	
}*/
public class ArrayTranponse {
	public static void main(String[] args) {
		int[][] testArray={
							{1,2,3},
							{4,5,6},
							{7,8,9}
						};
		int[][] data=new int[3][3];
		
		System.out.println("-----------");
		for (int i = 0; i < testArray.length; i++) {
			for (int j = 0; j < testArray[i].length; j++) {
				System.out.print(testArray[i][j]);
			}
			System.out.println();
		}
		System.out.println("-----------");
		for (int i = 0; i < testArray.length; i++) {
			System.out.print(testArray[i]);
			System.out.println();
		}
		System.out.println("-----------");
		for (int i = 0; i < testArray[0].length; i++) {
			System.out.println(testArray[0][i]);
		}
		
		
		//列遍历
		for(int i=0;i<testArray.length;i++){
			for (int j = 0; j < testArray[i].length; j++) {
				data[j][i]=testArray[i][j];
			}
		}		
		System.out.println("-----------");
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j]);
			}
			System.out.println();
		}
		System.out.println("-----------");
		
	}
}
