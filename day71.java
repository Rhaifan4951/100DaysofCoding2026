import java.util.Scanner;

public class day71 {
   public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
            	
   int pemasukan;
   int total = 0; 
    
   System.out.print("Masukkan pemasukan (angka negatif untuk berhenti) : ");        	
   pemasukan = in.nextInt();        
         	
      while (pemasukan >= 0) {
      
       total+=pemasukan;   
            	        	
       System.out.print("Masukkan pemasukan (angka negatif untuk berhenti) : "); 
       pemasukan = in.nextInt();   
            	   	
        }
          System.out.println("Total seluruh pemasukan : Rp " + total);
    
    }
}
