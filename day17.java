import java.util.Scanner;

public class day17 {
    public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
        
      System.out.print("Masukkan Poin Awal Pelanggan\t: ");
      int poinAwal = in.nextInt();
      System.out.print("Masukkan Poin Transaksi Baru\t: ");
      int poinTransaksiBaru = in.nextInt();
      System.out.print("Masukkan Poin yang Ditukarkan\t: ");
      int poinDitukarkan = in.nextInt();
        
      System.out.println("\n===RIWAYAT PERUBAHAN POIN===");
      System.out.println("Poin Awal\t\t\t: " + poinAwal);
        
      poinAwal += poinTransaksiBaru;  
      System.out.println("Setelah Tambah Transaksi(+"+poinTransaksiBaru+")\t: " + poinAwal);  
        
      poinAwal -= poinDitukarkan;
      System.out.println("Setelah Tukar Poin(-"+ poinDitukarkan +")\t\t: " + poinAwal);  
        
      poinAwal *= 2;
      System.out.println("Setelah Promo Double Points(*=2): " + poinAwal);
      System.out.println("Poin Akhir Pelanggan\t\t: " + poinAwal);  
        
   }
    
}
