import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Masukkan jumlah barang : ");
    int jumlah = in.nextInt();

    int[] harga = new int[jumlah];

    System.out.println();
    for (int i = 0; i < jumlah; i++) {
        System.out.print("Masukkan harga barang ke-" + (i + 1) + " : ");
        harga[i] = in.nextInt();
    }

    int murah = harga[0];

    System.out.println();
    for (int i = 1; i < jumlah; i++) {
        if (harga[i] < murah) {
            murah = harga[i];
        }
    }

    System.out.println("Harga barang termurah : " + murah);
      
 }
}
