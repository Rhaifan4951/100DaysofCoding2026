import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Batas Bawah : ");
        int a = in.nextInt();
        System.out.print("Masukkan Batas Atas : ");
        int b = in.nextInt();
        System.out.print("Masukkan Angka Target : ");
        int c = in.nextInt();

        if (c >= a && c <= b) {
            System.out.println("Di dalam range! ");
        } else {
            System.out.println("Di luar range! ");
        }
    }
}
