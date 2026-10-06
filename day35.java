import java.util.Scanner;

public class day35 {
    
  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        
     System.out.print("Apakah sudah terdaftar  : ");
     boolean daftar = in.nextBoolean();
        
     System.out.print("Masukkan nilai DDP\t: ");
        double ddp = in.nextDouble();
        
     System.out.print("Masukkan nilai PBO\t: ");
        double pbo = in.nextDouble();
        
     System.out.print("Masukkan nilai FWB\t: ");   
        double fwb = in.nextDouble();
        
        double rataRata = (ddp + pbo + fwb)/3;
        
        System.out.print("\n");
        if (daftar) {
            if (rataRata >= 75 ){
                System.out.printf("Rata-rata nilai : %.1f%n", rataRata);
                System.out.println("Status\t\t: Boleh mengikuti lomba");
            } else {
                System.out.printf("Rata-rata nilai : %.1f%n", rataRata);
                System.out.println("Status\t\t: Nilai belum memenuhi syarat");
            }
            
        } else {
            System.out.println("Status : Belum terdaftar");
        }
        
   }
}
