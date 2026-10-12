import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan suhu ruangan\t\t: ");
        double suhu = in.nextDouble();
        System.out.print("Masukkan kelembapan ruangan\t: ");
        double lembap = in.nextDouble();
        
        System.out.println();
        if (suhu >= 18 && suhu <= 28 && lembap >= 40 && lembap <= 60){
            System.out.println("Ruangan Nyaman");
            
        } else if (suhu < 18 || lembap < 40) {
            System.out.println("Suhu atau Kelembapan Terlalu Rendah");
        
        } else if (suhu > 28 || lembap > 60) {
            System.out.println("Suhu atau Kelembapan Terlalu Tinggi");
        }

    }
}
