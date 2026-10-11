import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan umur Anda : ");
        int a = in.nextInt();
        
        System.out.print("Apakah membawa KTP asli? (true/false) : ");
        boolean b = in.nextBoolean();

        if (a >= 17 && b) {
            System.out.println("Pendaftaran Diterima! Silahkan lanjut ke foto.");
        } else{
            System.out.println("Pendaftaran Ditolak! Usia belum mencukupi atau KTP tidak ada.");
        }
    }
}
