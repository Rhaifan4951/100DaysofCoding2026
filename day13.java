import java.util.Scanner;
public class day13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("NIM\t: ");
        String nim = in.nextLine();
        System.out.print("Kelas\t: ");
        String kelas = in.nextLine();
        System.out.print("Jurusan : ");
        String jurusan = in.nextLine();
        System.out.print("Hobi\t: ");
        String hobi = in.nextLine();
        
        System.out.println("\n");
        System.out.printf("NIM\t: %s\nKelas\t: %s\n", nim, kelas);
        System.out.printf("Jurusan : %s\nHobi\t: %s\n", jurusan, hobi);
    }

}
