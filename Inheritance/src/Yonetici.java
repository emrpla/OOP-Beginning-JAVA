
// Subclass denir çünkü çalışan clasından özellikleri alacak.
public class Yonetici extends Calisan{
   
    private int sorumlu_kisi;  //Ekstra özellik (sadece yönetici classına özgü)
    
    public Yonetici(String isim,String departman,int maas,int sorumlu_kisi) {
    
     /*this.isim=isim;
     this.departman=departman;
     this.maas=maas;*/ //Bu şekilde yazamam altaki gibi super anahtar kelimesini kullanmam lazım.
    super(isim, departman, maas);
    this.sorumlu_kisi=sorumlu_kisi;
    
}
    
    public void zam_yap(int zam){    //Bu clasa özgü method yazdık
        System.out.println("Çalışanlara "+zam+" TL zam yapıldı. ");
    }
    
    public void bilgiler(){   //Override yaptık
        
        /*System.out.println("İsim : "+getIsim());
        System.out.println("Departman : "+getDepartman());
        System.out.println("Maaş : "+getMaas()+" TL");*/
        super.bilgiler(); //Yukarıdaki gibide yazılabilir ama bu daha kısa ve kalıtım mantığına daha uygun bir kullanım.
        System.out.println("Sorumlu olunan kişi sayısı : "+sorumlu_kisi);
    }
}
