/* 
      Abstract class özellikleri :
--Aynı interface gibi burda da direk obje oluşturamayız ama referans verebiliriz.
--Özellik(Attribute) eklenebilir.
--Abstract class olabilmesi için en az bir tane gövdesiz methodu(soyut method) olmalı.

*/
public abstract class Sekil {
    
    private String isim;

    public Sekil(String isim) {
        this.isim = isim;
    }

   public void ismini_soyle(){
       System.out.println("Bu obje : "+isim+" objesidir." );
   }
    
   abstract void alan_hesapla();  // Bu bir soyut methoddur./ Alt sınıflar mutlaka bu methodu yazmalıdır.

   
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
   
   
    
    
}
