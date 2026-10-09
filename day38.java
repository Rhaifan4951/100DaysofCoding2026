import java.util.Scanner;

public class day38 {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
        
     System.out.println("=== MENU WARTEG CYBER 2077 ===\n"); 
     System.out.println("1. Nasi Hologram (Rp 15000)");
     System.out.println("2. Ayam Goreng Laser (Rp 20000)");
     System.out.println("3. Es Teh Matrix (Rp 5000)");  
     System.out.println("==============================\n");   
        
     System.out.print("Masukkan nomor pesanan : ");
     int nomor = in.nextInt();
        
     String menu = "";
     int satuan = 0;
        
        if (nomor ==1) {
            menu = "Nasi Hologram";
            satuan = 15000;
            
        } else if (nomor == 2) {
            menu = "Ayam Goreng Laser";
            satuan = 20000;
        
        } else if (nomor == 3) {
            menu = "Es Teh Matrix";
            satuan = 5000;
        } else {
            System.out.println("Waduhhh pesanan yang kamu masukkan tidak ada di menu!!!");
            return ;
        }
        
        System.out.print("Masukkan jumlah porsi : ");
        int jumlah = in.nextInt();
        
        System.out.print("Apakah punya Member?(true/false) : ");
        boolean member = in.nextBoolean();
        
        int totalHargaAwal = satuan * jumlah;
        
        System.out.println("\nMenu\t\t : " + menu);
        System.out.println("Porsi\t\t : " + jumlah + " porsi");
        System.out.println("Total harga awal : Rp" + totalHargaAwal);
        
        int diskon10Persen = 0;
        int diskonMember = 0;
        
        System.out.println();
        if (totalHargaAwal > 50000) {
            diskon10Persen = totalHargaAwal * 10/100;
            System.out.println("Selamat! Anda dapat Diskon Belanja Besar 10% (Potongan Rp " + diskon10Persen + ")");
        }
        
        if (member) {
            diskonMember = 5000;
            System.out.println("Diskon Member diterapkan (Potongan Rp 5000)");
            
        }
        
        System.out.println("\n============================\n");
        int totalBayar = totalHargaAwal - diskon10Persen - diskonMember;
        System.out.println("Total yang harus dibayar : Rp" + totalBayar);
        
        
    }
    
}
