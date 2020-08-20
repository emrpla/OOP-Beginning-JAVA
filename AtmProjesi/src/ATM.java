
import java.util.Scanner;


public class ATM {
    
    public void calis(Hesap hesap){
        login giris1 = new login();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hoşgeldiniz.");
        System.out.println("**************************");
        System.out.println("Kullanıcı Girisi.");
        System.out.println("**************************");
        int giris_hak =3;
        
        while (true) {            
           if(giris1.giris(hesap)){
               // login classı true dönerse burası çalışacak.
               System.out.println("Giriş Başarılı..");
               break;
           }else{
               System.out.println("Giriş başarısız");
               giris_hak -=1 ;
               System.out.println("kalan giriş hakkı :"+giris_hak);
               /*if (giris_hak==0){
                   System.out.println("3 kere yanlış değer girdiniz.");
                   break;*/ 
               }
            if(giris_hak==0){
                return; //Böyle yazdım çünkü yukarıdaki gibi sadece break yapsaydım Classı sonlandıramazdım.
           }
            
            
        }
        
        System.out.println("****************************");
        String islemler = "1. Bakiye sorgula\n"+
                          "2. Para yatırma\n"+
                           "3. Para çekme\n"+
                        "Çıkış için q ya basınız.";
        System.out.println(islemler);
        System.out.println("***************************");
        
        while (true) {            
            System.out.print("işlem seçiniz: ");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor.İyi günler...");
                break;
            }
            else if (islem.equals("1")){
                System.out.println("Bakiyeniz : "+hesap.getBakiye());
            }
            else if (islem.equals("2")){
                System.out.print("Yatırmak istediğiniz tutar :");
                double miktar = scanner.nextDouble();
                scanner.nextLine(); 
                hesap.paraYatir(miktar);
            }
            else if (islem.equals("3")){
                System.out.println("Çekmek istediğiniz miktar:");
                
                double miktar = scanner.nextDouble();
                scanner.nextLine();
                hesap.paraCek(miktar);
                    
              
            }else{
                System.out.println("Geçersiz işlem...");
            }
        }
        
        
    }
    
    
}
