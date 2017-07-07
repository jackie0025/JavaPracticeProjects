package jackie.studio01;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		
		//create folder
		File file =new File("e:\\_demo");
		boolean flag=file.mkdir();
		System.out.println("mkdir: "+flag);
		
		//create a txt file
		File file2=new File(file,"a.txt");
		try {
			flag=file2.createNewFile();
			System.out.println("createNewFile: "+flag);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
