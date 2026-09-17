import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Permen\t: ");
        int jumlahPermen = in.nextInt();
        System.out.print("Masukkan Jumlah Siswa\t: ");
        int jumlahSiswa = in.nextInt();
        
        int permenPerSiswa = jumlahPermen / jumlahSiswa;
        int permenYgTersisa = jumlahPermen % jumlahSiswa;
        
        System.out.println("Jumlah Permen\t\t: " + jumlahPermen);
        System.out.println("Jumlah Siswa\t\t: " + jumlahSiswa);
        System.out.println("Setiap Siswa Mendapatkan: " + permenPerSiswa);
        System.out.println("Permen yang Tersisa\t: " + permenYgTersisa);
        
         
    }
    
}
