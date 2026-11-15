import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Masukkan batas angka(n) : ");
    int angka = in.nextInt();
    int a = 1;
    int b = 1;
    for (int i = 1; i <= angka; i++) {
        System.out.print(i + " ");
        
    }
      System.out.println();
    while (a <= angka) {
        System.out.print(a + " ");
        a++;

        }
        System.out.println();

        do {
            System.out.print(b + " ");
            b++;

        } while (b <= angka);
        
    } 
}
