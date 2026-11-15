import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Masukkan angka awal : ");
    int a = in.nextInt();
    System.out.print("Masukkan angka akhir : ");
    int b = in.nextInt();
        
    for (int i = a; i <= b; i++) {
        System.out.print(i + " ");
        
    }
    }
    
}
