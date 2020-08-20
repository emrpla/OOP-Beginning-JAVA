
// Composition kavramında "HAS-A" ilişkisi vardı !!!!! (inheritance ise is-a)
public class Test {
    public static void main(String[] args) {
        
        Resolution resolution1 = new Resolution(1920, 1080);
        Monitor monitor1 = new Monitor("Mx11r", "Monster", 16, resolution1);
        
        Kasa kasa1 = new Kasa("RX-10", "Dell", "Titanyum");
        
        Anakart anakart1 = new Anakart("Bz-11","İntel", 16, "Windows 10");
        
        Bilgisayar pc1 = new Bilgisayar(monitor1, kasa1, anakart1);
        
        
        pc1.getKasa().bilgisayari_aç();
        pc1.getMonitor().monitoru_kapat();
        pc1.getAnakart().isletim_sistemi_yukle("Mac");
    
    }
    
    
}
