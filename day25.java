import java.util.Scanner;

public class day25 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari : ");
        int r = in.nextInt();
        
        final double phi = 3.14;
        double luas = phi * r * r;
        double keliling = 2 * phi * r;
        
        System.out.println("\nLuas Lingkaran\t   : " + luas);
        System.out.println("Keliling Lingkaran : " + keliling);
        
    }
    
}
