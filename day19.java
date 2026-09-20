public class day19 {
    public static void main(String[] args){
        
        double nilaiDouble = 150.75;
        float nilaiFloat = (float) nilaiDouble;
        long nilaiLong = (long) nilaiFloat;
        int nilaiInt = (int) nilaiLong;
        short nilaiShort = (short) nilaiInt; 
        byte nilaiByte = (byte) nilaiShort;
        
        System.out.println("Nilai Double\t: " + nilaiDouble);
        System.out.println("Nilai Float\t: " + nilaiFloat);
        System.out.println("Nilai long\t: " + nilaiLong);
        System.out.println("Nilai Int\t: " + nilaiInt);
        System.out.println("Nilai Short\t: " + nilaiShort);
        System.out.println("Nilai Byte\t: " + nilaiByte);
        
        
    }
}
