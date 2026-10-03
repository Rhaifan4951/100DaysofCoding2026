import java.util.Scanner;

public class Main{
    public static void day32(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Nilai\t\t: ");
        int nilai = in.nextInt();

        System.out.print("Pendapatan\t: ");
        int pendapatan = in.nextInt();

        System.out.print("Organisasi\t: ");
        boolean organisasi = in.nextBoolean();

        System.out.print("Pernah beasiswa\t: ");
        boolean beasiswaLain = in.nextBoolean();
        
        boolean syaratNilai = nilai >= 80;
        boolean syaratLainnya= (pendapatan <=4000000) || organisasi;
        boolean lolosSeleksi = syaratNilai && syaratLainnya && !beasiswaLain;
        
        System.out.println("\nSyarat nilai terpenuhi\t\t: " + syaratNilai);
        System.out.println("Syarat pendapatan/organisasi\t: " + syaratLainnya);
        System.out.println("Lolos seluruh seleksi\t\t: " + lolosSeleksi);

    }
}
