package array.list.test02;

import java.util.Random;

public class DataGenerator {
	public static int integerRandom(int range){
		Random random=new Random();
		return random.nextInt(range);
	}
}
