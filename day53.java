import java.util.Scanner;

public class day53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int counter = 0; 
        String pilihan;
        
        do {
            System.out.print("Masukkan nama menu : ");
            String menu = in.nextLine();
            
          
            System.out.println("[Pesanan dicatat...]\n");
            counter++;
            
            System.out.print("Pesan lagi (y/t) ? ");
            pilihan = in.nextLine();
            
            System.out.println();
        } while (pilihan.equalsIgnoreCase("y"));
        
        System.out.println("Pemesenan Selesai! ");
        System.out.println("Total pesanan Anda : " + contoh + " menu");
    }
}
