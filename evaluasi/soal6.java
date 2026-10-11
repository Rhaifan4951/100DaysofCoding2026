import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan HP : ");
        int a = in.nextInt();
        System.out.print("Masukkan Damage Musuh : ");
        int b = in.nextInt();
        System.out.print("Menang? (true/false) : ");
        boolean c = in.nextBoolean();
        
        System.out.println();
        int level = 1 ;
        if (c){
            level++;
            System.out.println("Sisa HP : " + a);
            System.out.println("Level : " + level);
        } else {
            int d = a - b;
            level--;
            System.out.println("SIsa HP : " + d);
            System.out.println("Level : " + level);
        }

    }
}
