class ArrayBinomial{
	public static void main(String[] args){
		int[][] arr = new int[10][10];
		for(int i=0;i<arr.length;i++){
			arr[i][0]=1;
			arr[i][i]=1;
		}
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<=i;j++){
				if(i!=0&&j!=0&&j!=i)
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		/*
		int[][] arr = new int[10][];
	
		for(int i=0;i<arr.length;i++){
			arr[i] = new int[i+1];
			arr[i][0]=1;
			arr[i][i]=1;
		}
		for(int i=0;i<10;i++){
			for(int j=0;j<=i;i++){
				if(i!=0&&j!=0&&j!=i){
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
					System.out.print(arr[i][j]+"\t");
				}				
			}
			System.out.println();
		}
		*/
		
		
	}
}