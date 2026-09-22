import java.util.Scanner;

   public class day21 {
       public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
        
       System.out.println("=== INPUT DATA MAHASISWA ===");
       System.out.print("Nama\t\t : ");
       String nama = in.nextLine(); 
           
       System.out.print("Umur\t\t : ");
       String umurString = in.nextLine();
           
       System.out.print("Tinggi Badan\t : ");
       String tinggiBadanString = in.nextLine();
           
       System.out.print("Huruf Awal\t : ");  
       String hurufAwalString = in.nextLine();
           
       System.out.print("Status Mahasiswa : ");
       String statusString = in.nextLine(); 
           
       System.out.print("Saldo Awal\t : ");
       String saldoAwalString = in.nextLine();   
           
       // Konversi dari String ke tipe data yang sesuai    
       int umur = Integer.parseInt(umurString);
       double tinggiBadan = Double.parseDouble(tinggiBadanString);
       char hurufAwal = hurufAwalString.charAt(0);
       boolean status = Boolean.parseBoolean(statusString);
       double saldoAwal = Double.parseDouble(saldoAwalString); 
           
       // Tampilkan Biodata Mahasiswa menggunakan printf()  
       System.out.println("\n=== BIODATA MAHASISWA ===");
       System.out.printf("Nama\t\t : %s%n", nama);    
       System.out.printf("Umur\t\t : %d Tahun %n", umur); 
       System.out.printf("Tinggi Badan\t : %.1f cm%n", tinggiBadan);  
       System.out.printf("Huruf Awal\t : %c%n", hurufAwal);
       System.out.printf("Status Mahasiswa : %b%n", status);  
       System.out.printf("Saldo Awal\t : Rp%.0f%n", saldoAwal);    
           
       // Tambahkan umur 1 tahun (+=)   
       umur += 1;
           
       // Tambahkan saldoAwal Rp50000 (+=)   
       saldoAwal += 50000;
       double setelahDitambah = saldoAwal;     
           
       // Kurangi saldoAwal  Rp25000 (-=)
       saldoAwal -= 25000;
       double setelahDikurang = saldoAwal;   
           
       // Kalikan saldoAwal dengan 2 (*=)   
       saldoAwal *= 2;
       double setelahDikali = saldoAwal;
           
       // Bagi saldoAwal dengan 5 (/=)   
       saldoAwal /= 5;
       double setelahDibagi = saldoAwal;
           
       // Cek Ganjil/Genap pada umur (%)   
       int jenisUmur = umur % 2;
           
       // Konversi otomatis umur : int jadi double   
       double  umurDouble = umur;
           
       // Konversi manual tinggiBadan : double jadi int    
       int tinggiBadanInt = (int) tinggiBadan;
           
       // Konversi kembali umur (double) dan saldoAwal (double) menjadi String 
       String umurBaruString = String.valueOf(umurDouble);
       String saldoAwalBaruString = String.valueOf(saldoAwal);
           
       // Tampilkan seluruh hasil pengolahan data menggunakan printf()   
       System.out.println("\n== HASIL PENGOLAHAN DATA ===");   
       System.out.printf("Saldo Awal\t\t\t : Rp%s%n", saldoAwalString);  
       System.out.printf("Setelah ditambah\t\t : Rp%.0f%n", setelahDitambah);
       System.out.printf("Setelah dikurang\t\t : Rp%.0f%n", setelahDikurang);
       System.out.printf("Setelah dikali\t\t\t : Rp%.0f%n", setelahDikali);    
       System.out.printf("Setelah dibagi\t\t\t : Rp%.0f%n", setelahDibagi);
       System.out.printf("Umur Setelah +1 Tahun\t\t : %d Tahun%n", umur);   
       System.out.printf("Umur Ganjil atau Genap\t\t : %d (1 = Ganjil, 0 = Genap)%n", jenisUmur); 
       System.out.printf("Umur (Konversi Otomatis)\t : %.0f Tahun%n", umurDouble);
       System.out.printf("Tinggi Badan (Konversi Manual)\t : %d cm%n", tinggiBadanInt);
       System.out.printf("Umur Baru (String)\t\t : %s Tahun%n", umurBaruString);    
       System.out.printf("Saldo Akhir (String)\t\t : Rp%s%n", saldoAwalBaruString);    

         
       }   
  }
