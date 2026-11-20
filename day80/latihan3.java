import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);	       
    	       
    int [] angka = {80, 85, 90, 75, 95};
    	       
    System.out.print("Masukkan indeks : ");	       
    int indeks = in.nextInt();	       
    	       
    if (indeks >= 0 && indeks < angka.length) {
    	  System.out.println("Nilai pada indeks " + indeks + " : " + angka[indeks]);
    	       	       
    } else {
    	  System.out.println("Indeks tidak ada");
           
      } 
    }
}
