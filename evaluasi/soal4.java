import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan berat emas : ");
        double a = in.nextDouble();

        if (a % 1 != 0.0) {
            System.out.println("Bilangan Desimal (Emas Digital)");
        }else{
            System.out.println("Bilangan Bulat (Emas Fisik)");
        }
    }
}
