
public class Kasa {
    
    private String model;
    private String üretici;
    private String malzeme;

    public Kasa(String model, String üretici, String malzeme) {
        this.model = model;
        this.üretici = üretici;
        this.malzeme = malzeme;
    }

    public void bilgisayari_aç(){
        System.out.println("Bilgisayar açlılıyor.");
    }
    
    
    
    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the üretici
     */
    public String getÜretici() {
        return üretici;
    }

    /**
     * @param üretici the üretici to set
     */
    public void setÜretici(String üretici) {
        this.üretici = üretici;
    }

    /**
     * @return the malzeme
     */
    public String getMalzeme() {
        return malzeme;
    }

    /**
     * @param malzeme the malzeme to set
     */
    public void setMalzeme(String malzeme) {
        this.malzeme = malzeme;
    }
    
    
    
}
