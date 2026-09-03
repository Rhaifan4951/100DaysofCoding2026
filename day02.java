public class day02 {
    public static void main(String[] args) {
        
        // 1. Use System.out.println
        // Mencetak teks dan otomatis membuat baris baru di akhir.
        System.out.println("--BIODATA DIRI--");
        System.out.println("Nama : Rhaifan Firansyah");
        
        // 2. Use System.out.print
        // Mencetak teks tanpa membuat baris baru di akhir.
        System.out.print("NIM : ");
        System.out.print("D0226040");
        System.out.println();
        System.out.print("Prodi : ");
        System.out.print("Informatika");
        System.out.println();
        
        String alamat = "Cilallang";
        int umur = 18;
        double tinggibadan = 163.4;
        
        // 3. User System.out.printf
        // Mencetak dengan format tertentu.
        System.out.printf("Alamat : %s%n",alamat);
        System.out.printf("Umur : %d tahun%n",umur);
        System.out.printf("Tinggi Badan : %.1f cm%n",tinggibadan);
        
    }
    
}
