import java.util.Scanner;

public class day48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka pertama : ");
        double angka1 = in.nextDouble();          

        System.out.print("Masukkan angka kedua : ");
        double angka2 = in.nextDouble();               

        System.out.print("Masukkan simbol operasi (+, -, *, /, %) : ");
        char simbol = in.next().charAt(0);

        double hasil = 0;
        boolean valid = true;
        
        switch (simbol) {
            case '+' :
              hasil = angka1 + angka2;
              break;
            
            case '-' :
              hasil = angka1 - angka2;
              break;
            
            case '*' : 
              hasil = angka1 * angka2;
              break;
            
            case '/' :
              if (angka2 == 0) {
                  System.out.println("Error! Pembagian dengan nol tidak terdefinisi!");
                  valid = false;
              } else {
                  hasil = angka1 / angka2;
              }
              break;
            
            case '%' :
              if (angka2 == 0) {
                  System.out.println("Error! Modulus dengan nol tidak terdefinisi!");
                  valid = false;
              } else {
                  hasil = angka1 % angka2;
              }
              break;
            
            default :
              System.out.println("Operasi tidak tersedia");
              valid = false;
        }
        
        if (valid){
            System.out.println("Hasil : " + hasil);
        }
    }
}    
