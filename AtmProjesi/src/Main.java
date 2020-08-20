


public class Main {
    
    public static void main(String[] args) {
        
        ATM atm = new ATM();
        
        Hesap hesap1 = new Hesap("Emre", "23", 2000.0);
        
        atm.calis(hesap1); 
        
        System.out.println("Programdan çıkılıyor...");
    }
    
    
}
