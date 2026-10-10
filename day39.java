import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        
    System.out.print("Masukkan angka pertama\t: ");
    double pertama = in.nextDouble();
        
    System.out.print("Masukkan angka kedua\t: ");    
    double kedua = in.nextDouble();
        
    System.out.print("Masukkan simbol operasi (+, -, *, /, %): ");
    char simbol = in.next().charAt(0);	
    	
    System.out.print("\n");	
    	if (simbol == '+'){
    		double hasilTambah = pertama + kedua;
    		System.out.println("Hasil dari " + pertama + " + " + kedua + " adalah " + hasilTambah);
    		
    	} else if (simbol == '-'){
    		double hasilKurang = pertama - kedua;
      	System.out.println("Hasil dari " + pertama + " - " + kedua + " adalah " + hasilKurang);
    		
    	} else if (simbol == '*'){
    		double hasilKali = pertama * kedua;
      	System.out.println("Hasil dari " + pertama + " * " + kedua + " adalah " + hasilKali);
    	
    	} else if (simbol == '/'){
    		if (kedua == 0){
    			System.out.println("Error, tidak terdefinisi");
    		} else {
    			double hasilBagi = pertama / kedua;
    			System.out.println("Hasil dari " + pertama + " / " + kedua + " adalah " + hasilBagi);
    		}
    	} else if (simbol == '%'){
    		if (kedua == 0){
    			System.out.println("Error, tidak terdefenisi");
    		} else {
    			double hasilSisaBagi = pertama % kedua;
    			System.out.println("Hasil dari " + pertama + " % " + kedua + " adalah " + hasilSisaBagi);
    		}
    	} else {
    		System.out.println("Waduhhh, Operasi yang anda masukkan tidak ada!!!");
    	}
    	
  }
}
