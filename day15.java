import java.util.Scanner;

  public class day15 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Harga Barang\t: ");
        int hargaBarang = in.nextInt();
        System.out.print("Masukkan Jumlah Barang\t: ");
        int jumlahBarang = in.nextInt();
        System.out.print("Masukkan Jumlah Orang\t: ");
        int jumlahOrang = in.nextInt();
        
        int totalHarga = hargaBarang * jumlahBarang;
        int hargaPerOrang = totalHarga / jumlahOrang;
        System.out.println("\nTotal harga\t: " + totalHarga);
        System.out.println("Harga per Orang\t: " + hargaPerOrang);
     }
  }
