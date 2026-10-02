import java.util.Scanner;

public class day31 {
   public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
       
    System.out.print("Masukkan umur\t\t: ");
    int a = in.nextInt();
       
    System.out.print("Masukkan nilai tugas\t: ");
    int b = in.nextInt();
       
    System.out.print("Apakah sudah terdaftar? : "); 
    boolean c = in.nextBoolean();
       
    boolean semua = (a >= 17) && (b >= 75) && c;
    boolean salahSatu = (a >= 17) || (b >= 75) || c;
    boolean daftar = !c;  
       
    System.out.println("\nMemenuhi semua syarat\t   : " + semua); 
    System.out.println("Memenuhi salah satu syarat : " + salahSatu);   
    System.out.println("Belum terdaftar\t\t   : " + daftar);   
       
   } 
}
