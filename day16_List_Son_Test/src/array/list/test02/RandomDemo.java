package array.list.test02;

import java.util.ArrayList;
import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		// 产生10个1~20的随机数，要求不能重复；
		Random random=new Random();
		ArrayList<Integer> arrayList = new ArrayList<>();
		int cnt = 0;
		
		while (cnt<10) {
			//产生随机数
			int num=random.nextInt(20)+1;
			
			if (!arrayList.contains(num)) {
				arrayList.add(num);
				cnt++;
			}
		}
		
		
		//下面是我写的,其实漏掉了20这个数，产生不了

//		// 产生10个1~20的随机数，要求不能重复；
//		int cnt = 0;
//		boolean saveflag=false;
//		ArrayList<Integer> arrayList = new ArrayList<>();
//		for (;;) {
//			int intTmp = DataGenerator.integerRandom(20);
//			saveflag=true;
//			if (intTmp != 0) {
//				for (int i : arrayList) {
//					if (i == intTmp) {
//						saveflag=false;
//						break;	
//					}
//				}
//				if (saveflag) {
//					arrayList.add(intTmp);
//					cnt++;
//					if (cnt == 9) {
//						break;
//					}
//				}
//			}
//			
//		}
		
		for (int i : arrayList) {
			System.out.print(i + ",");
		}
	}
}
