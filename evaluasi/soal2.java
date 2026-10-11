import java.util.Scanner;

public class soal2 {
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Masukkan sebuah angka : ");
    int a = in.nextInt();

    if (a > 0){
       if(a % 2 == 0) {
        System.out.println("Ini adalah angka Positif.");
        System.out.println("Angka ini bernilai Genap.");
       } else {
        System.out.println("Ini adalah angka Positif. ");
        System.out.println("Angka ini bernilai Ganjil. ");

       }
    } else if (a < 0){
        System.out.println("Ini adalah angka Negatif.");
    } else {
        System.out.println("Ini adalah angka Nol. ");
    }
 }   
}
