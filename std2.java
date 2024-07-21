package filehandl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import myprojects.stdentdata;



class stdentdata {
    char roll_no[], phone[];
    char name[], course[], email[];
	char cl[];
    int searchrollno;
    int n, i;

    
public 
    void file_create() {
        System.out.println("********YOUR WELCOME*******");
        File fo = new File("C:\\Users\\parti\\Desktop\\file\\Shiv.txt");
        try {
            if (fo.createNewFile()) {
                System.out.println("Your file created :");
            } else {
                System.out.println("<<<<<<<<<<<<<<<Your File Already Created>>>>>>>>>>>>>>>");
            }
        } catch (IOException i) {
            System.out.println("IOEx	ception Occurred");
        }
    }

    void dataEnter() throws IOException {
        Scanner o = new Scanner(System.in);
        FileWriter foo = new FileWriter("C:\\Users\\parti\\Desktop\\file\\Shiv.txt");

        try {
                   System.out.println("How many students records do you want to Enter ::");
            n = o.nextInt();
            for (i = 0; i < n; i++) {
            	 System.out.println("Enter your Roll_NO:");
                 roll_no = o.next().toCharArray();

                System.out.println("Enter your class:");
                cl =o.next().toCharArray();
                System.out.println("Enter your Course:");
                course = o.next().toCharArray();
                System.out.println("Enter your Gmail_ID:");
                email =o.next().toCharArray();
                System.out.println("Enter your Mobile_No:");
                phone = o.next().toCharArray();
                System.out.println("Enter your name:");
                name =o.next().toCharArray();
                               foo.write("Name: " + name + "\n");
                foo.write("Class: " + cl + "\n");
                foo.write("Course: " + course + "\n");
                foo.write("Email: " + email + "\n");
                foo.write("Roll No: " + roll_no + "\n");
            }
        } finally {
            foo.close();
            System.out.println("Thank you :");
        }
    }

    void datashow() {
        try {
            FileReader Readerob = new FileReader("C:\\Users\\parti\\Desktop\\file\\Shiv.txt");
            try {
                int i;
                while ((i = Readerob.read()) != -1) {
                    System.out.print((char) i);
                }
            } finally {
                Readerob.close();
            }
        } catch (IOException e) {
            System.out.println("Exception Handled ");
        }
    }
    void search() 
    {
    	
        try {
        	int rollno;
        	Scanner so=new Scanner(System.in);
        	System.out.println("Enter the Rollno YOu want the search : ");
        	rollno=so.nextInt();
            FileReader Readerob = new FileReader("C:\\Users\\parti\\Desktop\\file\\Shiv.txt");
            try {
                int i;
                while ((i = Readerob.read()) != -1) {
                	if(rollno==i) {
                   i=Readerob.read();

                    System.out.print((char)i);
                }
                }
            } finally {
                Readerob.close();
            }
        } catch (IOException e) {
            System.out.println("Exception Handled ");
        }
    }

    
    
}


public class std2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 stdentdata dataobject = new stdentdata();
//         dataobject.file_create();
//         dataobject.datashow();
//        dataobject.dataEnter();
        dataobject.datashow();
//        dataobject.datasearch();
        dataobject.search();


	}

}
