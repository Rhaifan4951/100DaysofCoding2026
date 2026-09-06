public class day05 {
    public static void main(String [] args) {
        
        /* Type Data double
         * For fractional numbers that are very large or require high precision.
         * This is the default data type for fractional numbers in Java.
         */
        
        double Nilaitugas = 85.5;
        double NilaiUTS = 90.0;
        double NilaiUAS = 90.5;
        
        // Menghitung nilai rata-rata
        double ratarata = (Nilaitugas + NilaiUTS + NilaiUAS) /3 ;
        
        System.out.println("===============\nNILAI MAHASISWA\n===============");
        System.out.println("Nilai Tugas\t: " + Nilaitugas);
        System.out.println("Nilai UTS\t: " + NilaiUTS);
        System.out.println("Nilai UAS\t: " + NilaiUAS);
        System.out.println();
        System.out.println("Rata-rata\t: " + ratarata);
    }
}
