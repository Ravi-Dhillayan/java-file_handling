package filehandl;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class std{
	int total=10;
	public
	char roll_no[];
	char name[];
	char clas[];
	char contact[];
	char gmail[];
	char phone[];
	char course[];

	
	void getdata() {
  
       int i,n;
		   Scanner o = new Scanner(System.in);

	
		System.out.println("How many students records do you want to Enter ::");
        n = o.nextInt();
        for (i = 0; i < n; i++) 
       {
        	 System.out.println("Enter your name:");
             name = o.next().toCharArray();
        	 System.out.println("Enter your Roll_NO:");
             roll_no = o.next().toCharArray();

            System.out.println("Enter your class:");
            clas = o.next().toCharArray();
            System.out.println("Enter your Course:");
            course = o.next().toCharArray();
            System.out.println("Enter your Gmail_ID:");
            gmail = o.next().toCharArray();
            System.out.println("Enter your Mobile_No:");
            phone = o.next().toCharArray();
           
           
	}
	}
        void display() {
        	int i,n;
        	System.out.println("Your Name : ");
       	 for (i = 0; i <name.length; i++) 
       	 {
       		 System.out.print(name[i]);
       	 }
       	 System.out.println();
       	 
       	
        	System.out.println("Your Roll_NO : ");
       	 for (i = 0; i <roll_no.length; i++) 
       	 {
       		 System.out.print(roll_no[i]);
       	 }
       	 System.out.println();
       	 System.out.println("Your class : ");
       	 for (i = 0; i <clas.length; i++) 
       	 {
       		 System.out.print(clas[i]);
       	 }
       	 System.out.println();
       	System.out.println("Your Course : ");
   	 for (i = 0; i <course.length; i++) 
   	 {
   		 System.out.print(course[i]);
   	 }
   	 System.out.println();
   	 System.out.println("Your gmail : ");
   	 for (i = 0; i <gmail.length; i++) 
   	 {
   		 System.out.print(gmail[i]);
   	 }
   	 System.out.println();
   	 System.out.println("Yout Phone Number : ");
   	for (i = 0; i <phone.length; i++) 
  	 {
  		 System.out.print(phone[i]);
  	 }
  	 System.out.println();
        	 
        	 
                 
               
                 
        }
}
class studentdata {
	void Enter(std classo) throws IOException {
		
	
		FileWriter fo = new FileWriter("C:\\Users\\parti\\Desktop\\file\\Shiv.txt");

        try {
        	
            classo.getdata();
	}
        finally {
            fo.close();
            System.out.println("Thank you :");
        }
}

}
public class filesearch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      std classobj=new std();
      
      studentdata studentdatao=new studentdata();
      studentdatao.Enter(classobj);
	}

}
