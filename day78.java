import java.util.Scanner;

public class day78 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);  
        
    System.out.println("=== REGISTRASI AKUN ===");   
    System.out.print("Buat username : ");
    String username = in.nextLine(); 
        
    System.out.print("Buat password : ");
    String password = in.nextLine();
        
    System.out.println("\nAkun berhasil dibuat.");    
    System.out.println();    
    System.out.println("=== LOGIN AKUN ===");
        
    String loginUsername;
    String loginPassword;
    boolean loginBerhasil = false;    
        
        do {
            System.out.print("Masukkan username : ");
            loginUsername = in.nextLine();
            
            System.out.print("Masukkan password : ");
            loginPassword = in.nextLine();
            
            System.out.println();
            
            if (loginUsername.equals(username) && loginPassword.equals(password)) {
                loginBerhasil = true;
                System.out.println("Selamat, Login Berhasil!");
                
            } else {
                System.out.println("Username atau password salah.");
                System.out.println("Silahkan login kembali.\n");
                
            }
            
        } while (!loginBerhasil); 
        
    }
}
