
public class Main {
    public static void main(String[] args) {
        
        Account hesap1 = new Account("Emre Pala","emre.@gmail.com","12345");
        Account hesap2 = hesap1;   // Heap yapısı.İkiside(hesap1 ve hesap2) bellekte aynı yere tutuluyor.
        
        Account hesap3 = new Account();
        // Hesap 1 ve 2 aynı objeyi referans alırken hesap3 farklı bir yerde tutuluyor bellekte ve farklı bir objeyi referans alıyor.
        
        
        new Account("Eren Pala","eren.@gmail.com","12345").bilgilerigoster();  // Bu şekilde bir değişken oluşturmadanda tek satırda-
        // Farklı işlemler yapabilirim ( methodları kontrol etme amaçlı kullanılır bu)
        
        
        
        /*
        int x = 5;
        int y =x;
        System.out.println("x in ilk değeri :"+x);
        System.out.println("y nin ilk değeri :"+y);
        System.out.println("/*****************************"); // Bu bir stack yapısı
        x = 4;
        System.out.println("x in değişen değeri : "+x);
        System.out.println("X değiştikten sonra y değeri :"+y);
        */
    }
    
    
}
