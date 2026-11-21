import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        
    System.out.print("Masukkan jumlah data : ");
    int jumlah = in.nextInt();
        
    int [] angka = new int[jumlah];
        
    System.out.println();    
        for (int i = 0; i < angka.length; i++) {
          System.out.print("Masukkan angka ke-" + (i + 1)+ " : ");
          angka[i] = in.nextInt();  
        
       
      } 
      System.out.println();  
      System.out.println("Data yang dimasukkan : ");
        
        for (int i = 0; i < angka.length; i++) {
	       System.out.println("Nilai ke-" + (i + 1) + " : " + angka[i]);
            
        }
    }
}
