import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        
    int [] angka = {10, 20, 15, 25, 30} ;
    int total = 0;
            
    System.out.println("Data angka : ");
    System.out.print("[");
      
            for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + ", ");
            total+=angka[i];    
                
        }  
        System.out.println("\b\b]");
        System.out.println("Total Penjumlahan : " + total);
    }
}
