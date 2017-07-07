package jackie.studio01;

import java.io.File;
/**
 * 获取所有目录下的.java文件
 * @author jackie0025@163.com
 *
 */
public class FilePathDemo {
	public static void main(String[] args) {
		//封装目录
		String  pathname="E:\\Workspace\\Eclipse\\Java\\JavaPracticeProjects";
		File srcFolder=new File(pathname);
		
		//递归实现
		getAllJavaFiles(srcFolder);
	}

	private static void getAllJavaFiles(File srcFolder) {
		// TODO 
		File[] files=srcFolder.listFiles();
		
		//遍历
		for(File file:files){
			if (file.isDirectory()) {
				getAllJavaFiles(file);
			}else {
				if (file.getName().endsWith(".java")) {
					System.out.println(file.getAbsolutePath());
				}
			}
			
		}
		
	}
	
}

