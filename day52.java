import java.util.Scanner;

public class day52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        final int pinBenar= 123456;
        System.out.print("Masukkan PIN : ");
        int pin = in.nextInt();
        
        while (pin != pinBenar) {
            System.out.println("PIN Salah. Silahkan coba lagi.");
            System.out.print("Masukkan PIN : ");
            pin = in.nextInt();
            
        }
            
        System.out.println("PIN Benar. Akses Diberikan.");
    }
}
