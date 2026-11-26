import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Masukkan jumlah barang : ");
    int jumlah = in.nextInt();
        
    int[] nomor = new int[jumlah];

    System.out.println();
    for (int i = 0; i < jumlah; i++) {
        System.out.print("Masukkan nomor barang ke-" + (i + 1) + " : ");
        nomor[i] = in.nextInt();
            
    }
    System.out.println();
        
    System.out.print("Masukkan nomor barang yang dicari : ");
    int cari = in.nextInt();
        
    boolean ditemukan = false;
        
    for (int i = 0; i < nomor.length; i++) {
        if (nomor[i] == cari) {
            ditemukan = true;
            break;
                
        }
    }
         
    System.out.println();
    if (ditemukan) {
        System.out.println("Nomor barang " + cari + " ditemukan.");
            
    } else {
            System.out.println("Nomor barang " + cari + " tidak ditemukan.");
    }
      
  }
}
