import java.util.Scanner;

public class day42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok : ");
        double pokok = in.nextDouble();

        System.out.print("Masukkan potongan bulanan : ");
        double potongan = in.nextDouble();

        double bersih = pokok - potongan;

        System.out.println();
        if (bersih == 0 && pokok > 0) {
            System.out.println("Gaji Bersih Nol: Harap Hubungi HRD!");
        
        } else if (bersih >= 5000000 && bersih <= 10000000 && potongan >= 500000 && potongan <= 1000000) {
            System.out.println("Gaji Bersih Standar");
        
        } else if (bersih < 5000000 || potongan > 1000000) {
            System.out.println("Gaji Bersih Terlalu Rendah atau Potongan Terlalu Besar");
        
        } else if (bersih > 10000000 || potongan < 500000) {
            System.out.println("Gaji Bersih Tinggi atau Potongan Sangat Kecil");
        }

    }
}
