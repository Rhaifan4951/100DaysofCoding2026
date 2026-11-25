import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Masukkan jumlah data : ");
    int jumlah = in.nextInt();

    int[] nilai = new int[jumlah];

    System.out.println();
    for (int i = 0; i < jumlah; i++) {
        System.out.print("Masukkan nilai ke-" + (i + 1) + " : ");
        nilai[i] = in.nextInt();
    }

    int terendah = nilai[0];

    System.out.println();
    for (int i = 1; i < jumlah; i++) {
        if (nilai[i] < terendah) {
            terendah = nilai[i];
        }
    }

    System.out.println("Nilai terendah : " + terendah);
      
  }
}
