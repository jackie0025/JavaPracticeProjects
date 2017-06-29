package jackie.studio08;

import java.util.HashSet;
import java.util.Random;
/*
 * 产生10个1到20的随机数
 */
public class RandomNum {
	public static void main(String[] args) {
		HashSet<Integer> hashSet=new HashSet<>();
		
		Random random =new Random();
		while (hashSet.size()<10) {
			hashSet.add(random.nextInt(20)+1);
		}
		for (Integer integer : hashSet) {
			System.out.print(integer+",");
		}
	}
}
