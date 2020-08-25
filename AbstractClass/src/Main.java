
public class Main {
    public static void main(String[] args) {
        
        Kare kare1 = new Kare("Kare", 5);
        kare1.alan_hesapla();
        kare1.cevre_hesapla();
        //System.out.println(kare1.getIsim());
        
        Daire daire1 = new Daire(3, "Daire1");
        daire1.alan_hesapla();
        
        
        Sekil Kare2 = new Kare("Kare2", 9);
        Kare2.alan_hesapla();
        //Kare2.cevre_hesapla(); Hata verir. Çünkü cevre_hesapla() methodu Kare classına özgü bir methoddur.
    }
}
