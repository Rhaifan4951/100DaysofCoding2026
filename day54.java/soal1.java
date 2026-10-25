import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = 0;
      
        for (int i = 2; i <= a ; i +=2) {
            b += i;
          
        } 
         System.out.println(b);
    }
}
