package stringbuffer.test;

import java.util.Arrays;

public class Sort {
	
	/**
	 * 
	 * @param table
	 * @return
	 * PS：这是我一开始自己想的算法，原来叫选择排序
	 */
	public static void sortChooseAscend(int[] table){
		for(int i=0;i<table.length;i++){
			//for(int j=0;j<table.length;j++)//结果是降序，9876543210
			//for(int j=i;j<table.length;j++)//应该y=i+1，y=i无效计算了一次
			for(int j=i+1;j<table.length;j++){
				if (table[i]>table[j]) {
					int tmp=table[i];
					table[i]=table[j];
					table[j]=tmp;
				}
			}
		}
	}

	/**
	 * 冒泡排序，升序
	 * @param table
	 * 在冒泡排序中，最重要的思想是两两比较，将两者较小的升上去
	 */
	public static void sortBubbleAscend(int[] table){
		for(int i=0;i<table.length;i++){
			//每次由底向上升
			for(int j=table.length-1;j>i;j--){
				if (table[j]<table[j-1]) {
					int tmp=table[j];
					table[j]=table[j-1];
					table[j-1]=tmp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] table=new int[10000];
		for(int i=0;i<10000;i++){
			table[i]=(int) (Math.random()*10000);
		}
		System.out.println(Arrays.toString(table));

		long start=System.currentTimeMillis();
		Arrays.sort(table);
		long end=System.currentTimeMillis();
		System.out.println("API sort\rElapseTime:"+(end-start)+"ms\r");//计算运行时间
		
		for(int i=0;i<10000;i++){
			table[i]=(int) (Math.random()*10000);
		}
		
		start=System.currentTimeMillis();
		sortChooseAscend(table);
		end=System.currentTimeMillis();
		System.out.println("Selection sort\rElapseTime:"+(end-start)+"ms\r");//计算运行时间
		
		for(int i=0;i<10000;i++){
			table[i]=(int) (Math.random()*10000);
		}
		
		start=System.currentTimeMillis();
		sortBubbleAscend(table);
		end=System.currentTimeMillis();
		System.out.println("Bubble sort\rElapseTime:"+(end-start)+"ms\r");//计算运行时间
		
		System.out.println(Arrays.toString(table));
	}

}
