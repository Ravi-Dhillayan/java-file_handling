package filehandl;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class Power {
    void pow() {
        int a, b, c = 1;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the A number : ");
        a = ob.nextInt();
        System.out.println("Enter the B Number  : ");
        b = ob.nextInt();

        while (b != 0) {
            c = c * a;
            --b;
        }
        System.out.println("Answer for A Power B : " + c);
    }
}

public class wfile {
    public static void main(String[] args) throws IOException {
        Power obj = new Power();
        obj.pow();

        FileWriter o = new FileWriter("C:\\Users\\parti\\Desktop\\myq.txt");
        try {
            o.write("Hello");
        } catch (IOException i) {
            System.out.println(i);
        } finally {
            o.close();
        }
    }
}

