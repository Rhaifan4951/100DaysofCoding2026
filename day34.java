import java.util.Scanner;

public class day34 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        
    System.out.print("Masukkan nilai ujian : ");  
    int nilai = in.nextInt();
        
    System.out.print("Apakah sudah terdaftar? : ");    
    boolean daftar = in.nextBoolean();
        
        System.out.print("\n");
        
        if (nilai >= 80 && nilai <= 100) {
            System.out.println("Kategori Nilai  : Sangat Baik");
        } else if (nilai >= 70 ) {
            System.out.println("Kategori Nilai  : Baik");
        } else if (nilai >= 60) {
            System.out.println("Kategori Nilai  : Cukup");
        } else {
            System.out.println("Kategori Nilai  : Kurang");
        }
        
        if (nilai >= 60 && daftar){
            System.out.println("Status\t\t: Lulus");
        } else {
            System.out.println("Status\t\t: Tidak Lulus");
        }
   }
  }
