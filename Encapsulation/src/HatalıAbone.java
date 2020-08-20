// Bir doğalgaz abonesi tanımlama

public class HatalıAbone {
    
    public String isim;
    public int bakiye;
    public String sehir;

   /* public Abone(String isim, int bakiye, String sehir) {
        this.isim = isim;
        this.bakiye = bakiye;
        this.sehir = sehir;
        if (bakiye>120){
            System.out.println("Bakiye değeri 120 den büyük olamaz");
        }
    }*/
    
    public void dogalgaz_kullan(int miktar){
        
        if (this.bakiye<miktar){
            System.out.println("Yeterli bakiyeniz yoktur.");
        }else{
            this.bakiye -= miktar;
            
            if (this.bakiye<0){
                System.out.println("Bakiyeniz bitmiştir lütfen en yakın yükleme merkezine gidiniz.");
            }else {
                System.out.println("Yeni bakiye : "+this.bakiye);
            }
        }
    }
    
    public void bakiye_ogren(){
        System.out.println("Bakiye : "+this.bakiye);
    }
}

