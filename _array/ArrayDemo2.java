class ArrayDemo2{
	public static void main(String[] args){
		//define array
		int[][] arr =  new int[3][];
		
		System.out.println(arr);//[[I@659e0bfd
		System.out.println(arr[0]);//null
		System.out.println(arr[1]);//null
		System.out.println(arr[2]);//null
		
		//
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[1];
		
		System.out.println(arr[0]);//[I@2a139a55
		System.out.println(arr[1]);//[I@15db9742
		System.out.println(arr[2]);//[I@6d06d69c
		
		//output elements of array 
		System.out.println(arr[0][0]);//0
		System.out.println(arr[0][0]);//0
		
	}
}