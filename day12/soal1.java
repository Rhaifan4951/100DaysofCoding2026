import java.util.Scanner;

  public class soal1 {
    public static void main (String[] args){
      
      Scanner input = new Scanner(System.in);
      
        System.out.print("Masukkan Username    : ");
        String username = input.nextLine();
        
        System.out.print("Masukkan Umur\t     : "); 
        byte umur = input.nextByte();
        
        System.out.print("Masukkan Tinggi Badan: ");
        double tinggiBadan = input.nextDouble();
        
        System.out.print("Masukkan Gol.Darah   : ");
        char golDarah = input.next().charAt(0);
        
        System.out.print ("Apakah Akun Privat   : ");
        boolean akunPrivat = input.nextBoolean();
        
        System.out.println("\n======PROFILEFACEGRAM======");
        
        System.out.println("Username\t: "+ username);
        System.out.println("Umur\t\t: " + umur);
        System.out.println("Tinggi Badan\t: " + tinggiBadan);
        System.out.println("Gol.Darah\t: "+ golDarah);
        System.out.println("Akun Privat\t: " + akunPrivat);
        System.out.println("===========================");
        
     }
  }
