
public class DuzgunAbone {
    
    private String isim;
    private int bakiye = 120;       //  Bütün objelerin ilk bakiye değeri 120 olmalı ama bu constructor ile değişebilir.
    private String sehir;

    public DuzgunAbone(String isim,int bakiye ,String sehir) {
        this.isim = isim;
        if (bakiye>=0 && bakiye<=120){
            this.bakiye = bakiye;
        } // Eğer if koşuluna girmezse bakiyenin değeri otomatikman 120 olacak .
        this.sehir = sehir;
    }
    
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
