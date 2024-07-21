package filehandl;
import java.io.*;

public class Write {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		File o=new File("C:\\Users\\parti\\Desktop\\file\\dog.txt");
//		try {
//		if(o.createNewFile()) {
//		System.out.println("Your file Create : ");
//		
//		}
//		else {
//			System.out.println("Your File Already created : ");
//		}
//		
//		}
//		catch(Exception i) {
//			System.out.println("red Exception ::"+i);
//		}
		FileReader o=new FileReader("C:\\Users\\parti\\Desktop\\file\\dog.txt");
	try {
		int i;
		while((i=o.read())!=-1) {
			System.out.println((char)i);
		}
	}
	finally {
		o.close();
	}
	}

}
