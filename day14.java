import java.util.Scanner;

public class day14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Tabungan Awal\t: ");
        int tabungan = in.nextInt();
        System.out.print("Masukkan Uang Masuk\t: ");
        int uangMasuk = in.nextInt();
        System.out.print("Masukkan Uang Diambil\t: ");
        int uangDiambil = in.nextInt();
        
        System.out.println("=======================");
        System.out.println("     DATA TABUNGAN     ");
        System.out.println("=======================");
        System.out.println("Tabungan Awal\t: " + tabungan);
        System.out.println("Uang Masuk\t: " + uangMasuk);
        System.out.println("Uang Diambil\t: " + uangDiambil);
        int jumlah = tabungan + uangMasuk;
        int total = jumlah - uangDiambil;
        System.out.println("\nJumlah Tabungan\t: " + total);
        System.out.println("=======================");
    }
}
