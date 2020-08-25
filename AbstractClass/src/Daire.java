
public class Daire extends Sekil{

    private int yari_cap;
    //private double pi = 3.14;

    public Daire(int yari_cap, String isim) {
        super(isim);
        this.yari_cap = yari_cap;
    }
    
    
    @Override
    void alan_hesapla() {
        System.out.println(getIsim()+" alanı : "+(Math.PI*yari_cap*yari_cap)+" birimdir.");
        
    }
    
    
    
    
}
