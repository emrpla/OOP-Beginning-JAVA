
public class PcMuhendisi implements IMuhendis{

    private boolean askerlik;
    private boolean adli_sicil;

    public PcMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }
    
    
    
    @Override
    public void askerlik_durumu_sorgula() {
        if(askerlik){
            System.out.println("Askerlik yapıldı.");
        }else{
            System.out.println("Askerlik yapılmadı.");
        }
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
    
        return "Ortalamam : "+derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if(adli_sicil){
            System.out.println("Adli Sicil Kaydım Bulunuyor.");
        }else{
            System.out.println("Adli sicil kaydı bulunmuyor.");
        }
    }

    @Override
    public void is_tecrübesi(String[] array) {
    
        if(array.length>0){
            System.out.println("Bilgisayar Mühendisi olarak çalıştım bu firmalarda.");
            for(String x : array){
                System.out.println(x);
            }
            
        }else{
            System.out.println("Herhangi bir iş tecrübem bulunmamaktadır.");
        }
    }
    
    
}
