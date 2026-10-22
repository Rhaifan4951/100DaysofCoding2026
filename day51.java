import java.util.Scanner;

public class day51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan tinggi segitiga : ");
        int tinggi = input.nextInt();
        
        for (int a = 1; a <= tinggi; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(b + " ");
            }
            
            System.out.println();
        }
    }
}
