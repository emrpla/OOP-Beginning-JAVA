
public class Hayvan {
    
    private  String isim;
    private  int boy;
    private int kilo;
    private int bacak_sayisi;
    
    
    public Hayvan(String isim,int boy,int kilo,int bacak_sayisi){
        
        this.isim=isim;
        this.boy=boy;
        this.kilo=kilo;
        this.bacak_sayisi=bacak_sayisi;
    }
    public void yemek_ye(){
        System.out.println("Hayvan şuan yemek yiyor.");
    }
    public void harekete_gec(int hiz){
        System.out.println("Hayvan saatte "+hiz+"km hız ile hareket ediyor");
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the boy
     */
    public int getBoy() {
        return boy;
    }

    /**
     * @param boy the boy to set
     */
    public void setBoy(int boy) {
        this.boy = boy;
    }

    /**
     * @return the kilo
     */
    public int getKilo() {
        return kilo;
    }

    /**
     * @param kilo the kilo to set
     */
    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    /**
     * @return the bacak_sayisi
     */
    public int getBacak_sayisi() {
        return bacak_sayisi;
    }

    /**
     * @param bacak_sayisi the bacak_sayisi to set
     */
    public void setBacak_sayisi(int bacak_sayisi) {
        this.bacak_sayisi = bacak_sayisi;
    }
    
}
