package AU;
 
import java.util.Scanner;

public class Main {
    
    public static int Fact( int n) {
        if( n == 0 || n == 1)
        return 1;

         return n* Fact(n-1);
         

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(Fact(n));
         

    }

}
