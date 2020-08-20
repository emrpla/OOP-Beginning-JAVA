
public class Monitor {
    
    private String model;
    private String üretici;
    private int boyut;
    
    private Resolution resolution;

    public Monitor(String model, String üretici, int boyut, Resolution resolution) {
        this.model = model;
        this.üretici = üretici;
        this.boyut = boyut;
        this.resolution = resolution;
    }

    public void monitoru_kapat(){
        System.out.println("Monitör Kapatılıyor.");
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
     * @return the boyut
     */
    public int getBoyut() {
        return boyut;
    }

    /**
     * @param boyut the boyut to set
     */
    public void setBoyut(int boyut) {
        this.boyut = boyut;
    }

    /**
     * @return the resolution
     */
    public Resolution getResolution() {
        return resolution;
    }

    /**
     * @param resolution the resolution to set
     */
    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
    
    
    
}



