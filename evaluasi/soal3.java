import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== MESIN KOPI OTOMATIS ===");
        System.out.println("1. Kopi Hitam (Rp 5000)");
        System.out.println("2. Cappuccino (Rp 10000)");
        System.out.println("3. Teh Manis (Rp 4000)");
        System.out.println("=====================");

        System.out.print("Pilih nomor minuman (1/2/3) : ");
        int a = in.nextInt();

        System.out.println();
        if (a == 1){
            System.out.println("Anda memilih Kopi Hitam.");
            System.out.println("Silakan masukkan uang sebesar Rp 5000.");
            
        } else if (a == 2){
            System.out.println("Anda memilih Cappucino. ");
            System.out.println("Silakan masukkan uang sebesar Rp 10000.");
            
        } else if (a == 3 ){
            System.out.println("Anda memilih Teh Manis. ");
            System.out.println("Silakan masukkan uang sebesar Rp 4000.");

        } else {
            System.out.println("Pilihan tidak valid! Minuman tidak ditemukan.");
        }
    }
}
