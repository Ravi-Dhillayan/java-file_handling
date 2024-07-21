package filehandl;
import java.io.*;


public class cer {

	public static void main(String[] args) throws Exception{
		File oob =new File("C:\\Users\\parti\\Desktop\\file\\Ashok.txt");
		try {
			if(oob.createNewFile()) {
				System.out.println("Your File Create ....");
			}
			else
			{
				System.out.println("Your File Already Created....");			}
		}
		catch(Exception i) {
			System.out.println("<<<<<<<<<<<<<<<Your File Already Created>>>>>>>>>>>>>>>");
		}
		FileReader ob =new FileReader("C:\\Users\\parti\\Desktop\\file\\Ashok.txt");
	try {
		int i;
		while((i=ob.read())!=-1) {
			System.out.print((char)i);
		}
	}
	finally {
		ob.close();
	}

	}

}



























// TODO Auto-generated method stub    2nd 

//FileReader o=new FileReader("C:\\Users\\parti\\Documents\\as.txt");
//try {
//	int i;
//	
//		 while((i=o.read())!=-1)
//{
//	System.out.print((char)i);
//}
//		
//}
// finally {
//	 o.close();
//	 System.out.println("<<<<<<<<<<<<<<<<FILE CLOSED>>>>>>>>>>>>>>>>");
// }
//
//
//F oo=new F();
//oo.file();
//
//
//
//
//import java.io.*;
//class F{
//	void file() throws IOException {
//		File ob=new File("C:\\Users\\parti\\Desktop\\file\\aa.txt");
//		try {
//		if(ob.createNewFile()) {
//			System.out.println("File Created ...!");
//			
//		}
//		else
//		{
//			System.out.println("File Already >>");
//		}}
//		finally {
//			System.out.println("File Already >>");
//		}
//		
//	}
//}