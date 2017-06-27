package stringbuffer.test;

import java.util.Arrays;

public class Sort {
	
	/**
	 * 
	 * @param table
	 * @return
	 * PS��������һ��ʼ�Լ�����㷨��ԭ����ѡ������
	 */
	public static void sortChooseAscend(int[] table){
		for(int i=0;i<table.length;i++){
			//for(int j=0;j<table.length;j++)//����ǽ���9876543210
			//for(int j=i;j<table.length;j++)//Ӧ��y=i+1��y=i��Ч������һ��
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
	 * ð����������
	 * @param table
	 * ��ð�������У�����Ҫ��˼���������Ƚϣ������߽�С������ȥ
	 */
	public static void sortBubbleAscend(int[] table){
		for(int i=0;i<table.length;i++){
			//ÿ���ɵ�������
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
		System.out.println("API sort\rElapseTime:"+(end-start)+"ms\r");//��������ʱ��
		
		for(int i=0;i<10000;i++){
			table[i]=(int) (Math.random()*10000);
		}
		
		start=System.currentTimeMillis();
		sortChooseAscend(table);
		end=System.currentTimeMillis();
		System.out.println("Selection sort\rElapseTime:"+(end-start)+"ms\r");//��������ʱ��
		
		for(int i=0;i<10000;i++){
			table[i]=(int) (Math.random()*10000);
		}
		
		start=System.currentTimeMillis();
		sortBubbleAscend(table);
		end=System.currentTimeMillis();
		System.out.println("Bubble sort\rElapseTime:"+(end-start)+"ms\r");//��������ʱ��
		
		System.out.println(Arrays.toString(table));
	}

}
