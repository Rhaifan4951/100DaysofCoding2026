import java.util.Scanner;
  
  public class day11 {
      public static void main(String[] args){
          
          // Scanner digunakan untuk menerima input dari pengguna melalui keyboard.
          
          Scanner input = new Scanner (System.in);
          
          System.out.println("====INPUT BIODATA MAHASISWA====");
          
          System.out.print("Nama\t     : ");
          String nama = input.nextLine();
          
          System.out.print("NIM\t     : ");
          String nim = input.nextLine();
          
          System.out.print("Umur\t     : ");
          int umur = input.nextInt();
          
          System.out.print("Tinggi Badan : ");
          double tinggibadan = input.nextDouble();
          
          System.out.print("Grade\t     : ");
          char grade = input.next().charAt(0);
          
          System.out.println("\n=====BIODATA MAHASISWA=====");
          
          System.out.printf("%-15s: %s%n","Nama", nama);
          System.out.printf("%-15s: %s%n","NIM", nim);
          System.out.printf("%-15s: %d Tahun%n", "Umur", umur);
          System.out.printf("%-15s: %.2f cm%n","Tinggi Badan", tinggibadan);
          System.out.printf("%-15s: %c%n","Grade", grade);
          
          System.out.println("\n===========================");
      }
    
}
