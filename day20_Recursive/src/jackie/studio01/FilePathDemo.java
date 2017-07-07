package jackie.studio01;

import java.io.File;
/**
 * ��ȡ����Ŀ¼�µ�.java�ļ�
 * @author jackie0025@163.com
 *
 */
public class FilePathDemo {
	public static void main(String[] args) {
		//��װĿ¼
		String  pathname="E:\\Workspace\\Eclipse\\Java\\JavaPracticeProjects";
		File srcFolder=new File(pathname);
		
		//�ݹ�ʵ��
		getAllJavaFiles(srcFolder);
	}

	private static void getAllJavaFiles(File srcFolder) {
		// TODO 
		File[] files=srcFolder.listFiles();
		
		//����
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

