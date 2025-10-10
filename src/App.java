import java.util.Scanner;

public class App {
     public static void main(String[] args) throws Exception {
     Scanner in = new Scanner(System.in);
        
        System.out.println("Enter First number?");
        int first = in.nextInt();
        System.out.println("Enter Last number?");
        int last = in.nextInt();
        
        for ( int a = first; a <= last; a++) {
            System.out.println(a);
        }
    

    }
}
