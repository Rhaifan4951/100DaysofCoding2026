import java.util.Scanner;

public class day49 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan total belanja : ");
        int total = in.nextInt();
        
        String kategori = (total >=500000) ? "Pelanggan VIP" : "Pelanggan Reguler" ;
        String bonus = (total % 2 == 0) ? "Voucher Cashback" : "Poin Reward" ;
        
        System.out.println("===== DATA PELANGGAN =====\n");
        System.out.println("Total Belanja : " + total);
        System.out.println("Kategori : " + kategori);
        System.out.println("Bonus : " + bonus);
        
    }
}    
