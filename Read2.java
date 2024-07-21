package filehandl;
import java.io.*;
//import java.io.*;

class read11 {
    void Sound() {
        System.out.println("Animal Sound");
    }

    void Data() {
        System.out.println("Data");
    }
}

class Cat extends read11 {
    @Override
    void Sound() {
        System.out.println("Cat Sound");
        
    }

    void Demo() {
        System.out.println("Demo Sound<<<<<<<<<<<<<<<<<<<<<<<<Hello >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}

class Dog extends Cat {
    void Sound() {
        System.out.println("Dog Sound<<<<<<<<<<<<<<<<<<<<<<<<Hello >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
//    super.soud();
}

public class Read2 {
    public static void main(String[] args) throws IOException {
        Dog A = new Dog(); // Create an instance of Dog
        
        A.Sound(); // Call the Sound method of Dog

//        FileReader ob = new FileReader("C:\\Users\\parti\\Documents\\as.txt");
//        try {
//            int i; // Change long to int
//            while ((i = ob.read()) != -1) {
//                System.out.print((char) i);
//            }
//        } finally {
//            System.out.println();
//            ob.close();
//            
//        }
        A.Sound();
        A.Demo();
      
      
    }
}


