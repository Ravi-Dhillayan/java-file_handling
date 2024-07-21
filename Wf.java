package filehandl;
import java.io.*;
import java.io.IOException;
import java.util.*;
public class Wf {
	

	

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
//			Scanner oo=new Scanner(System.in);
//			charg ss;
//			ss=oo.next().charAt(0);
			
			FileWriter w=new FileWriter("C:\\Users\\parti\\Desktop\\file\\dog.txt");
			String s="RAVI";
			try {
				
		for(int i=0;i<s.length();i++) {
					w.write(s.charAt(i));
					
					
			}
		System.out.println(s);
				w.close();
				
			}
			catch(IOException r) {
				r.getCause();
				System.out.println(r);
			}
		}

	}


