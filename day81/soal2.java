import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        
    System.out.print("Masukkan jumlah nama : ");
    int jumlah = in.nextInt();
        
    String [] nama = new String[jumlah];
        
    in.nextLine();   
    System.out.println();    
        for (int i = 0; i < nama.length; i++) {
          System.out.print("Masukkan nama ke-" + (i + 1)+ " : ");
           
          nama[i] = in.nextLine();  
        
        } 
      System.out.println();  
      System.out.println("Daftar nama : ");
        
        for (int i = 0; i < nama.length; i++) {
	       System.out.println(nama[i]);
            
        }
    }
}
