
public class Kopek extends Hayvan{
    
    private int dis_sayisi;
    
    public Kopek(String isim,int boy,int kilo,int bacak_sayisi,int dis_sayisi){
        
        super(isim, boy, kilo, bacak_sayisi);
        this.dis_sayisi =dis_sayisi;
        
    }
    
    public void harekete_gec(int hiz){
        System.out.println("Köpek saatte "+hiz+"km hız ile hareket ediyor");
    }

    public void kos(int hiz){
        
        System.out.println("Köpek Koşuyor.");
        harekete_gec(hiz); //Böyle yazarsam yukarıda olan harekete geç fonksiyonu çalışır ama "super.harekete_gec()" yazarsam Hayvan clasındaki harekete geç fonksiyonu çağırılmış oluyor.
    }
    
    /**
     * @return the dis_sayisi
     */
    public int getDis_sayisi() {
        return dis_sayisi;
    }

    /**
     * @param dis_sayisi the dis_sayisi to set
     */
    public void setDis_sayisi(int dis_sayisi) {
        this.dis_sayisi = dis_sayisi;
    }
    
}
