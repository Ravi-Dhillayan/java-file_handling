package filehandl;
import java.io.File;

public class Ffh {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File obj = new File("C:\\Users\\parti\\Desktop\\my.txt");
		
		try {
  if(obj.createNewFile()) {
	  System.out.println("Create Your File..!");
	  
  }
  else
  {
	 System.out.println("File Already Exist...!"); 
  }
		}
	catch(Exception h) {
		System.out.println("File Already Exist...!"); 
	}
	
	}

}
