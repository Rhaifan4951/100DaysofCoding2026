import java.util.Scanner;

public class day26 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        
    //soal 1    
    System.out.print("Masukkan Nama\t\t: ");
    String a = in.nextLine();   
        
    System.out.print("Masukkan NIM\t\t: ");
    String b = in.nextLine();
        
    System.out.print("Masukkan Kelas\t\t: ");
    char c = in.next().charAt(0);
        
    System.out.print("Masukkan Umur\t\t: ");  
    int d = in.nextInt();
    in.nextLine();   
        
    System.out.print("Masukkan Prodi\t\t: "); 
    String e = in.nextLine();
        
    System.out.print("Masukkan IPK\t\t: "); 
        double f = in.nextDouble();
        
    System.out.print("Status Keaktifan\t: "); 
    boolean g = in.nextBoolean();
        
    System.out.println("\n=== BIODATA MAHASISWA ===");
    System.out.println("Nama\t\t: " + a);
    System.out.println("NIM\t\t: " + b);
    System.out.println("Kelas\t\t: " + c);
    System.out.println("Umur\t\t: " + d);    
    System.out.println("Prodi\t\t: " + e);    
    System.out.println("IPK\t\t: " + f);    
    System.out.println("Status Aktif\t: " + g);    
    System.out.println("===================");    
        
      //soal 2  
     int r = in.nextInt();  
        
     double phi = 3.14;
     double luas = phi * r * r;   
        
     System.out.println(luas);      

    // soal 3    
    int h = in.nextInt();
    int i = in.nextInt();
        
    int j = h;
    h = i;
    i = j;
        
    System.out.println("\n" + h); 
    System.out.println(i);    
        
   }
    
}
