import java.util.Scanner;

public class day23 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        
    System.out.print("Masukkan Sisi Persegi : ");
    int sisi = in.nextInt();
        
    int luas = sisi * sisi;
    int keliling = 4 * sisi;
        
    System.out.println("\nLuas Persegi\t : " + luas);
    System.out.println("Keliling Persegi : " + keliling);    
        
    }
    
}
