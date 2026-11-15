import java.util.Scanner;

public class soal9 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
      int a = in.nextInt();
      int total = 1;
      for (int i = 1; i <= a; i++) {
        total*=i;
        
      }
      System.out.println(total);
      
    }  
}
