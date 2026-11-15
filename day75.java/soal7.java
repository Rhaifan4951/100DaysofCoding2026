import java.util.Scanner;

public class soal7 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Masukkan batas angka(n): ");
    int a = in.nextInt();

    for (int i = 1; i <= a; i++) {
        for (int j = 1; j <= a; j++) {
            System.out.print("* ");
        }
      System.out.println();  
    }
    
    }
    
}
