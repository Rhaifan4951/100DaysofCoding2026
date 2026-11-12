import java.util.Scanner;

public class day72 {
   public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
      
   int menu;
      
      do {
             System.out.println("=== KANTIN KAMPUS ===");
          System.out.println("1. Nasi Goreng (Rp15000)");
          System.out.println("2. Mie Goreng (Rp12000)");
          System.out.println("3. Ayam Geprek (Rp18000)");
          System.out.println("4. Keluar");
      
          System.out.print("Pilih menu : ");
          menu = in.nextInt();
         
          System.out.println();
        
          if (menu == 1) {
            System.out.println("Anda memilih Nasi Goreng\nHarga : Rp15000");
                
         } else if (menu == 2) {
            System.out.println("Anda memilih Mie Goreng\nHarga : Rp12000");
            
         } else if (menu == 3) {
            System.out.println("Anda memilih Ayam Geprek\nHarga : Rp18000");
            
         } else if (menu == 4) {
            System.out.println("Terima kasih telah menggunakan layanan kantin!");
         
         } else {
            System.out.println("Menu tidak tersedia");
         }
         
         System.out.println();
        
      } while (menu != 4);
        
    }
}
