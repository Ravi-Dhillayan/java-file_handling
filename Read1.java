package filehandl;
import java.io.*;

public class Read1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader ob=new FileReader("C:\\Users\\parti\\Desktop\\dog.txt");
  try {
	  int i;
	  while((i=ob.read())!=-1) {
		  System.out.print((char)i);
	  }
  }
  finally {
	  System.out.println();
	  ob.close();
	  System.out.println("CLOSED :: tHANKU ..");
  }
	}

}
