import java.util.Scanner;

public class day56 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        
    int nilai = in.nextInt();
        
        for (int i = 1; i <= nilai; i++) {
            System.out.print(i + " ");
          
        }  
      
        System.out.println();
      
        for (int n = nilai; n >= 1; n--) {
            System.out.print(n + " ");
          
        }
        
    }
}
