
public class Hesap {
    
    private String kullanici;
    private String parola;
    private Double bakiye;

    
    public Hesap(String kullanici, String parola, Double bakiye) {
        this.kullanici = kullanici;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public void paraYatir(double miktar){
        bakiye += miktar;
        System.out.println("Yeni Bakiyeniz : "+bakiye+"'TL dir.");
        
    }
    public void paraCek(double miktar){
        if (miktar>bakiye){
            System.out.println("Hesabınızda bu kadar para yoktur. Lütfen kredi için bankaya başvurunuz");
        }else{
            if(miktar>1500.0){
                System.out.println("24 saat içerisinde maximum 1500 tl alabilirsiniz.");
            }else if(miktar<150.0){
                bakiye -= miktar;
                System.out.println("Kalan Bakiyeniz :"+bakiye);
            }
        }
        
        
    }
    
    public String getKullanici() {
        return kullanici;
    }

    public void setKullanici(String kullanici) {
        this.kullanici = kullanici;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public Double getBakiye() {
        return bakiye;
    }

    public void setBakiye(Double bakiye) {
        this.bakiye = bakiye;
    }
   

}