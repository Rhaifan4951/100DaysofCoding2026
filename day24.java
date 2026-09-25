import java.util.Scanner;

public class day24 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        
    System.out.print("Masukkan Panjang : ");
    int panjang = in.nextInt();
        
    System.out.print("Masukkan Lebar\t : ");
    int lebar = in.nextInt();
        
    int luas = panjang * lebar;
    int keliling = 2 * (panjang + lebar);
        
    System.out.println("\nLuas Persegi Panjang\t : " + luas);
    System.out.println("Keliling Persegi Panjang : " + keliling);    
        
    }
    
}
