import java.util.Scanner;

public class day33 {
  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        
    System.out.print("Masukkan nilai ujian\t: ");
    int nilai = in.nextInt();
        
    System.out.print("Apakah sudah terdaftar?\t: ");
    boolean terdaftar = in.nextBoolean();
        
    System.out.print("\n");    
        if (nilai >= 80 && terdaftar) {
            System.out.println("Boleh mengikuti ujian");
        } else {
            System.out.println("Belum boleh mengikuti ujian");
        }
            
        
    }
    
}
