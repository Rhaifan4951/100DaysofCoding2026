import java.util.Scanner;

public class day58 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        
    int nilai = in.nextInt();   
        
        for (int i = nilai; 1 <= i; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                
            }
            
        }
        System.out.print(" ");
        for (int n = nilai; 1 <= n; n--) {
            if (n % 2 == 0) {
            System.out.print(n + " ");
                
            }
            
        }
        
    }
    
}
