import java.util.Scanner;

public class day36 {
  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        
    System.out.print("Masukkan nomor peserta : ");
    int nomor = in.nextInt();
        System.out.print("\n");
        
        if (nomor % 2 == 0){
            System.out.println("Nomor peserta adalah Genap");
        } else {
            System.out.println("Nomor peserta adalah Ganjil");
        }   
        
   }
}
