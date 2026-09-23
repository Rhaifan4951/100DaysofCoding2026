import java.util.Scanner;

 public class day22 {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan nilai a : ");
        int a = in.nextInt();
        
        System.out.print("Masukkan nilai b : ");
        int b = in.nextInt();
        
        System.out.println("\nSebelum ditukar : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        int c = a;
        
        System.out.println("\nDengan variabel tambahan : ");
        System.out.println("a = " + b);
        System.out.println("b = " + c);
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("\nTanpa menggunakan variabel : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
    }
}
