
import java.util.Scanner;


public class login {
    
    public boolean giris(Hesap hesap){
        
        Scanner deneme = new Scanner(System.in);
        String kullanici_adi;
        String parola;
        
        System.out.print("Kullanıcı adı :");
        kullanici_adi = deneme.nextLine();
        System.out.print("Parola :");
        parola = deneme.nextLine();
        
        if(hesap.getKullanici().equals(kullanici_adi) && hesap.getParola().equals(parola)){
            return true;
        }else{
            return false;
        }
        
        
    }

    
}
