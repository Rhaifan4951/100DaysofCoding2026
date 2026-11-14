import java.util.Scanner;

public class day74 {
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
        
    System.out.println();    
       
    System.out.println("Nama lengkap kosong\t: " + nama.isEmpty());  
    System.out.println("Konfirmasi nama\t\t: " + konfirmasi.equals(nama)); 
    System.out.println("Program studi sesuai\t: " + prodi.equalsIgnoreCase("Informatika"));
    System.out.println("Email kampus valid\t: " + email.contains("@kampus.ac.id"));    
        
    } 
}
