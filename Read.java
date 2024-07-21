package filehandl;
import java.io.*;
import java.util.Scanner;


public class Read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String s="";
		FileReader ob=new FileReader("C:\\Users\\parti\\Desktop\\file\\sa.txt");
		try {
			int i;
			while((i=ob.read())!=-1) {
				//System.out.print((char)i);
				s+=(char)i;
			}
		}
		finally
		{
			System.out.println(s);
			ob.close();
			System.out.println("file Closed ..!");
		}
//		 catch (ArithmeticException eq) {
//	            System.out.println("An arithmetic exception occurred: " );
//	        }
//		
		 FileWriter oo = new FileWriter("C:\\Users\\parti\\Desktop\\file\\sa.txt");
	        try {
//	        	System.out.println(s);
	    		String sen,neww ,rep;
	    		Scanner o=new Scanner(System.in);
	    		
//	    		System.out.println("Enter a Sentance : ");
//	    		name=o.nextLine();
	    		System.out.println("Enter the word you want to replace : ");
	    		 sen=o.nextLine();
	    		System.out.println("Enter the new word : ");
	    		 neww=o.nextLine();
	    		 rep=s.replace(sen,neww);
	    		System.out.println("Replaced word : ");
	    		 System.out.println(rep);
	    		for(int i=0;i<rep.length();i++) {
	    		 oo.write(rep.charAt(i));
//	    		 System.out.println("hi");
	    		}
//	          
	           oo.close();	    
	           System.out.println("file closed");
	           } catch (IOException i) {
	            System.out.println(i);
	        
	        }
	        FileReader obb=new FileReader("C:\\Users\\parti\\Desktop\\file\\sa.txt");
			try {
				s="";
				int i;
				while((i=obb.read())!=-1) {
					//System.out.print((char)i);
					s+=(char)i;
				}
			}
			finally
			{
				System.out.println(s);
				obb.close();
				System.out.println("file Closed ..!");
			}
	}

}
