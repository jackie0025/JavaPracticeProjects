package array.list.test02;

import java.util.ArrayList;
import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		// ����10��1~20���������Ҫ�����ظ���
		Random random=new Random();
		ArrayList<Integer> arrayList = new ArrayList<>();
		int cnt = 0;
		
		while (cnt<10) {
			//���������
			int num=random.nextInt(20)+1;
			
			if (!arrayList.contains(num)) {
				arrayList.add(num);
				cnt++;
			}
		}
		
		
		//��������д��,��ʵ©����20���������������

//		// ����10��1~20���������Ҫ�����ظ���
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
