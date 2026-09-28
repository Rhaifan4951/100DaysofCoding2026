import java.util.Scanner;

public class day27 {
    public static void main(String[] args){
     Scanner in = new Scanner(System.in);
        
     System.out.print("Masukkan nilai pertama\t: ");   
     int a = in.nextInt();  
        
     System.out.print("Masukkan nilai kedua\t: ");   
     int b = in.nextInt(); 
        
      System.out.println("\nNilai pertama sama dengan nilai kedua\t : " +(a == b));
      System.out.println("Nilai pertama berbeda dengan nilau kedua : " + (a != b));  
        
    }
}
