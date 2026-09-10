public class day09 {
     public static void main (String [] args) {
         
         /* Konstanta adalah variabel yang nilainya tetap dan tidak dapat diubah setelah diberikan nilai.
          * Dalam Java, konstanta dibuat menggunakan kata kunci : final.
          */
          
         final double harga = 15000;
         final double diskon = 0.10;
         
         // Proses menghitung Harga Setelah Diskon
         
         double jumlahdiskon = harga * diskon;
         double hargasetelahdiskon = harga - jumlahdiskon;
         
         System.out.println("Harga Awal\t    : "+ harga);
         System.out.println("Diskon (10%)\t    : "+ jumlahdiskon);
         System.out.println("Harga Setelah Diskon: "+ hargasetelahdiskon);

     }
    
}
