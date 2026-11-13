import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        
    System.out.print("Masukkan nama lengkap : ");
    String nama = in.nextLine();
       
    System.out.println();   
       
    System.out.println("Nama Asli\t: " + nama);
    System.out.println("Jumlah Karakter : " + nama.length()); 
    System.out.println("Huruf Kapital\t: " + nama.toUpperCase());
    System.out.println("Huruf Kecil\t: " + nama.toLowerCase());   
       
       
       
    } 
}
