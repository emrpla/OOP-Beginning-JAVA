
public class Kare extends Sekil{

    private int kenar;
    public Kare(String isim,int kenar) {
        super(isim);
        this.kenar=kenar;
    }

    
    
    @Override
    void alan_hesapla() {
        System.out.println(getIsim()+" nin alanı :"+(kenar*kenar)+" birimdir.");    
    
    }
    public void cevre_hesapla(){
        System.out.println(getIsim()+ " Çevresi : "+(4*kenar)+" birimdir.");
    }
}
