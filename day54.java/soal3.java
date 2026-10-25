import java.util.Scanner;

public class anjay {
  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        
     int a = in.nextInt();
     int b = 0;
        
        for (int i = 1; i < a; i++){
            if (a % i == 0) {
            b += i;
              
            }
        }   
        
        if (b == a) {
            System.out.println("Perfect Number");
            
        } else {
            System.out.println("Not a Perfect Number");
          
        }
   }
}
