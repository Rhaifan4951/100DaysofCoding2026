import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Masukkan jumlah mahasiswa : ");
    int mhs = in.nextInt();
 
    in.nextLine();
    String[] nama = new String[mhs];

    System.out.println();
    for (int i = 0; i < mhs; i++) {
        System.out.print("Masukkan nama ke-" + (i + 1) + " : ");
        nama[i] = in.nextLine();
            
    }
    System.out.println();
        
    System.out.print("Masukkan nama yang dicari : ");
    String cari = in.nextLine();
        
    boolean ditemukan = false;
        
    for (int i = 0; i < nama.length; i++) {
        if (nama[i].equals(cari)) {
            ditemukan = true;
            break;
                
        }
    }
         
    System.out.println();
    if (ditemukan) {
        System.out.println("Nama " + cari + " ditemukan.");
            
    } else {
        System.out.println("Nama " + cari + " tidak ditemukan.");
    }
      
  }
}
