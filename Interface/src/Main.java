// Javada çoklu kalıtım yoktur çünkü parent classların içindeki fonksiyonların isimleri aynı olursa sıkıntı çıkar.Bu nedenle interface var.
// İnterfacelerden bir obje oluşturamayız ama interface e uyacak classlar interfacein referansını kullanıp kendine implemet(uygulamak/anlaşmayı yerine getirme) edebilir
// İnterfacin içinde herhangibir özellik(Attribute) bulunmaz sadece finall ve static değişkenler tanımlanabilir.
// Bir class birden fazla interfaceyi kendine implemet edebilir(Çoklu kalıtım benzeri)

public class Main {

    
    public static void main(String[] args) {
        
        PcMuhendisi muhendis1 = new PcMuhendisi(true, false);
        //IMuhendis muhendis1 = new PcMuhendisi(true, false); --> yazabilirdim.
        
       /* muhendis1.adli_sicil_sorgula();
        muhendis1.askerlik_durumu_sorgula();
        
        String[] tecrube = {"Turkcell","LC Waikiki","Vodafone"};
        muhendis1.is_tecrübesi(tecrube);
        
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.67));*/
        
        MakineMuhendisi mühendis2 = new MakineMuhendisi(false, true);
        //IMuhendis mühendis2 = new MakineMuhendisi(false, true);  yazarsam referans_getir methodu hata verir o yüzden normal tanımlama yapmalıyım.
        // İlla IMuhendis ile tanımlaycaksan o zaman şöyle yazman lazım : ((MakineMuhendis)muhendis2).referans_getir(referans);   hata vermez artık
        String[] tecrube = {"Aselsan","Amazon"};
        String [] referans = {"Çiğdem tarhan","Vahap tecim"};
        
        mühendis2.adli_sicil_sorgula();
        mühendis2.askerlik_durumu_sorgula();
        mühendis2.is_tecrübesi(tecrube);
        System.out.println(mühendis2.mezuniyet_ortalamasi(2.12));
        mühendis2.referans_getir(referans);
        mühendis2.calis();
    }
    
}
