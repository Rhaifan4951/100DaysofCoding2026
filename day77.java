import java.util.Scanner;

public class day77 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);  
        
    System.out.print("Masukkan nama lengkap\t: ");
    String nama = in.nextLine(); 
        
    System.out.print("Konfirmasi nama lengkap\t: ");
    String konfirmasi = in.nextLine();
        
    System.out.print("Masukkan program studi\t: ");
    String prodi = in.nextLine();
        
    System.out.print("Masukkan alamat email\t: ");
    String email = in.nextLine();      
        
    String namaTrim = nama.trim();
    String namaSubString = namaTrim.substring(0, 3);
    String namaReplace = namaTrim.replace(" ", "_");  
        
    System.out.println();    
    System.out.println("Nama Setelah Trim\t: " + namaTrim);
    System.out.println("Jumlah Huruf\t\t: " + namaTrim.length());    
    System.out.println("Nama Huruf Kapital\t: " + namaTrim.toUpperCase()); 
    System.out.println("Nama Huruf Kecil\t: " + namaTrim.toLowerCase());    
    System.out.println("Tiga Karakter Pertama\t: " + namaSubString);
    System.out.println("Nama Setelah Replace\t: " + namaReplace); 
        
    System.out.println();    
    System.out.println("Nama Kosong\t\t: " + nama.isEmpty());  
    System.out.println("Konfirmasi Nama Sesuai\t: " + konfirmasi.equals(namaTrim)); 
    System.out.println("Program Studi Sesuai\t: " + prodi.equalsIgnoreCase("Informatika"));
    System.out.println("Email Kampus Valid\t: " + email.contains("@kampus.ac.id"));        
        
    }
}
