import java.util.Scanner;

public class App {
     public static void main(String[] args) throws Exception {
     Scanner in = new Scanner(System.in);
        
        //asking printer to print first name
        System.out.println(" First number?");
        int first = in.nextInt();
        System.out.println("Last number?");
        int last = in.nextInt();
        
        for ( int a = first; a <= last; a++) {
            System.out.println(a);
        }
    

    }
}
