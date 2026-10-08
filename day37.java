import java.util.Scanner;

public class day37 {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
        
    System.out.print("Masukkan kode energi : ");
    int energi = in.nextInt();
        
    System.out.print("\n");
        
        if (energi > 0){
            if (energi % 2 == 0){
                System.out.println("Kode Diterima(Energi Positif)");
                System.out.println("Berhasil! Pintu Brangkas Utama Terbuka, dokumen rahasia diamankan");
                
            }else {
                System.out.println("Kode Diterima(Energi Positif)");
                System.out.println("JEBAKAN! pintu terbuka tapi menemprotkan Gas Beracun!");
                
            }
        } else if (energi < 0){
            if (energi % 2 != 0) {
                System.out.println("HACKER TERDETEKSI (Energi Negatif)");
                System.out.println("Peringatan Kritis! Pintu ruangan terkunci, Robot Penjaga dikerahkan!");
        
            }else {
                System.out.println("HACKER TERDETEKSI (Energi Negatif)");
                System.out.println("Peringatan! Alarm Level 1 Berbunyi!");
            } 
        } else {
            System.out.println("Sistem brankas dimatikan. Harap mulai ulang.");
        }
        
    }
    
        }
