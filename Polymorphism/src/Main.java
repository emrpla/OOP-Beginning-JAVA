class Hayvan{    // Suüperclass      // Başına public koymadık çünkü aynı sayfada birden fazla class yazacağım . Public olan class en altta
    
    private String isim;

    
    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public String konus(){
        return "Hayvan konuşuyor.";
    }
}

class Kedi extends Hayvan{    //subclass

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" miyavlıyor.";
    }
}

class Kopek extends Hayvan{   //subclass

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" havlıyor.";
        
    }        
}

class At extends Hayvan{     //subclass

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" kişniyor.";
    }
}



// Bir nesnenin birden farklı nesne gibi davranması denebilir. Bunu yapabilmek için inheritance kullanmalısın. Aşşağıda görüldüğü üzere -
// - Hayvan clasındaki objeyi bir alt clasının objesi gibi davrandırabildik.
public class Main {
    
    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }
    
    public static void main(String[] args) {
        
        Hayvan hayvan1 = new Kedi("Kömür");
        Hayvan hayvan2 = new Kopek("Paşa");
        
        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());
        // Eğer konuş methodu alt sınıflarda olmasaydı direk hayvan clasındaki konuş methodu çağırılırdı.
        
        System.out.println("*********************************");
        
        konustur(new At("Gülbatur"));
        konustur(new Kedi("Cevat"));
        
        
        
        
        
    }
    
}
