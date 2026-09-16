import java.util.Scanner;

  public class day15 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Harga Barang\t: ");
        int h = in.nextInt();
        System.out.print("Masukkan Jumlah Barang\t: ");
        int j = in.nextInt();
        System.out.print("Masukkan Jumlah Orang\t: ");
        int o = in.nextInt();
        
        int k = h * j;
        int m = k / o;
        System.out.println("\nTotal harga\t: " + k);
        System.out.println("Harga per Orang\t: " + m);
     }
  }
