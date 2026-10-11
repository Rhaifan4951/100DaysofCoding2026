import java.util.Scanner;

public class soal7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== MENU ATM ===");
        System.out.println("1. Setor Uang");
        System.out.println("2. Tarik Uang");
        System.out.print("Pilih Menu (1/2) : ");
        int menu = in.nextInt();

        int saldo = 100000;
        System.out.println();
        if (menu == 1) {
            System.out.print("Masukkan Nominal : ");
            int nominal = in.nextInt();
            int setor = saldo + nominal;
            System.out.println("Setor berhasil. Saldo Anda: Rp "+ setor);
        } else if (menu == 2){
            System.out.print("Masukkan Nominal : ");
            int nominal = in.nextInt();
            if (nominal <= saldo){
                int tarik = saldo - nominal;
                System.out.println("Tarik tunai berhasil. Saldo Anda: Rp " + tarik);
            } else {
                System.out.println("Maaf, saldo tidak cukup! Saldo Anda: Rp " + saldo);
            }
        } else {
            System.out.println("Error: Menu tidak valid. Transaksi dibatalkan.");
        } 
    }
              }
