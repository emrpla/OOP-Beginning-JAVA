
public class Araba2 {
    
    private String renk;   // Şuan araba classının içine bir özellik(attribute) ekledim (Erişim belirleyicisi private,public veya protected olabilir)
    private int kapilar;
    private int tekerlekler;
    private String motor;
    private String model;
 
    
   public void setModel(String modelisim){
       
       // Eğer Fonksiyon içindeki değişken adım modelisim yerine model olsaydı javanın kafası karışmasın diye ;
       // this.model = model yazmalıydım.// ((java)this==self(python))
       
       model = modelisim; // Method içindeki değişken ile clas içindeki değişken ismi farklı olduğu için "this" kullanmama gerek yok .
   }
   
   public String getModel(){
       return this.model;   // Bu örnekte this yazma zorunluluğum yok ama yazdım.
   }

   
   
    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the kapilar
     */
    public int getKapilar() {
        return kapilar;
    }

    /**
     * @param kapilar the kapilar to set
     */
    public void setKapilar(int kapilar) {
        
        if (kapilar<0){
            System.out.println("Kapı değeri negatif olamaz.");
        }else{
            this.kapilar=kapilar;
        }
    }

    /**
     * @return the tekerlekler
     */
    public int getTekerlekler() {
        return tekerlekler;
    }

    /**
     * @param tekerlekler the tekerlekler to set
     */
    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    /**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }
   
   
   
}

