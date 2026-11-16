import java.util.Scanner;

public class day76 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);  
        
    System.out.print("Masukkan nama lengkap : ");
    String nama = in.nextLine(); 
        
    String namaTrim = nama.trim();
    String namaSubString = namaTrim.substring(0, 3);
    String namaReplace = namaTrim.replace(" ", "_");  
        
    System.out.println("Nama Awal\t\t: " + nama);
    System.out.println("Nama Setelah Trim\t: " + namaTrim); 
    System.out.println("Tiga Karakter Pertama\t: " + namaSubString);
    System.out.println("Nama Setelah Replace\t: " + namaReplace);  
        
    }
}
