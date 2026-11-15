import java.util.Scanner;

public class soal12 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
       
    int a = 1234;
    int b;
    int c = 0;

    do {

        c++;
        System.out.print("Masukkan PIN Anda : ");
        b = in.nextInt();
        
        if (b != a) {
        System.out.println("PIN salah, silahkan coba lagi!");

      }
        System.out.println();
      
    } while (b != a && c < 3) ;
    if ( b == a) {
        System.out.println("PIN benar! Selamat datang.");
    } else {
        System.out.println("Anda salah 3 kali. Kartu ATM terblokir.");
    }

    }
}
