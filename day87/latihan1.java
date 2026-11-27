import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Masukkan jumlah mahasiswa : ");
    int mhs = in.nextInt();

    int[] nilai = new int[mhs];
        
    System.out.println();
    for (int i = 0; i < nilai.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
        nilai[i] = in.nextInt();
    }

    System.out.println();
    System.out.println("Data sebelum diubah :");
    for (int i = 0; i < nilai.length; i++) {
        System.out.print(nilai[i] + " ");
      
    }
         
    System.out.println("\n");
    System.out.print("Masukkan indeks yang ingin diubah : ");
    int ubah = in.nextInt();

    System.out.print("Masukkan nilai baru : ");
    int baru = in.nextInt();

    nilai[ubah] = baru;

    System.out.println();
    System.out.println("Data setelah diubah :");
    for (int i = 0; i < nilai.length; i++) {
        System.out.print(nilai[i] + " ");
    }
   
  }
}
