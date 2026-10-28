import java.util.Scanner;

public class day57 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        
    int nilai = in.nextInt();
        
        for (int i = 1; i <= nilai; i+=2) {
            System.out.print(i + " ");
        }    
        System.out.print(" ");
        for (int n = 2; n <= nilai; n+=2) {
            System.out.print(n + " ");
        }
        
    }
    
}
